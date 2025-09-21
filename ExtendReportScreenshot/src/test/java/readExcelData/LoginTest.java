import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://glams53qa.glams.ie/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {
        String excelPath = "path/to/your/excel/file.xlsx";
        String sheetName = "loginDataSheet";
        return ExcelUtils.getExcelData(excelPath, sheetName);
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) throws InterruptedException {
        driver.findElement(By.id("UserName")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("login_submit")).click();
        Thread.sleep(5000);

        // Add your verification/assertion logic here based on the login result
    }

    public class ExcelUtils {

        public Object[][] getExcelData(String excelPath, String sheetName) throws IOException {
            FileInputStream file = new FileInputStream(excelPath);
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheet(sheetName);

            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

            Object[][] testData = new Object[rowCount - 1][colCount]; // Subtract 1 for header row

            for (int i = 1; i < rowCount; i++) {
                for (int j = 0; j < colCount; j++) {
                    testData[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
                }
            }

            workbook.close();
            return testData;
        }
    }
}
