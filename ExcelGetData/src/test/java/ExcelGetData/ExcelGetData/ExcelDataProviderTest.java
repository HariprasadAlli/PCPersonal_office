package ExcelGetData.ExcelGetData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProviderTest {

    static WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\Practise\\ExcelGetData\\chromedriver.exe");
        // Launch Chrome browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://glams53qa.glams.ie/");
        Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {
        String excelPath = "C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\Practise\\ExcelGetData\\GLAMSCrds.xlsx";
        String sheetName = "sheet1";
        return ExcelUtils1.getExcelData(excelPath, sheetName);
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) throws InterruptedException {
        driver.findElement(By.id("UserName")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        // Add your login verification/assertion logic here
        Thread.sleep(5000);
    }
}

class ExcelUtils1 {
    public static Object[][] getExcelData(String excelPath, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(excelPath);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] testData = new Object[rowCount - 1][colCount]; // Subtract 1 for the header row

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                testData[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }

        workbook.close();
        return testData;
    }
}
