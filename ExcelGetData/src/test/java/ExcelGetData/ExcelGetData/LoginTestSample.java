package ExcelGetData.ExcelGetData;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExtendReports.FreeCRMTest;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginTestSample {

    public static  WebDriver driver;
    public static  ExtentReports extent;
	public static ExtentTest extentTest;

    @BeforeMethod
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://glams53qa.glams.ie/");
    }

    @AfterMethod
    public static void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "loginData")
    public static Object[][] getLoginData() throws IOException {
        String excelPath = "C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\eclipse-java-2023-06-R-win32-x86_64\\eclipse\\GLAMSCrds.xlsx";
        String sheetName = "loginDataSheet";
        return ExcelUtils.getExcelData(excelPath, sheetName);
    }

    @Test(dataProvider = "loginData")
    public static void loginTest(String username, String password) {
        driver.findElement(By.id("UserName")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("login_submit")).click();

        // Add your verification/assertion logic here based on the login result
    }


@AfterMethod
public static void tearDown(ITestResult result) throws IOException {

	if (result.getStatus() == ITestResult.FAILURE) {
		extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
		extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in
																						// extent report

		String screenshotPath = FreeCRMTest.getScreenshot(driver, result.getName());
		extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); // to add screenshot in extent
																						// report
		// extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath));
		// //to add screencast/video in extent report
	} else if (result.getStatus() == ITestResult.SKIP) {
		extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	} else if (result.getStatus() == ITestResult.SUCCESS) {
		extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

	}

	extent.endTest(extentTest); // ending test and ends the current test and prepare to create html report
	driver.quit();
}

static class ExcelUtils {

    public static Object[][] getExcelData(String excelPath, String sheetName) throws IOException {
        try (FileInputStream file = new FileInputStream(excelPath)) {
            Workbook workbook = WorkbookFactory.create(file);
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
}
