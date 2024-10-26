package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TrackerHoldToRelease {
	
	
	private static WebElement element = null;
	private static WebElement element1 = null;
	private static WebElement element2 = null;
	public static WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;

	
	public static WebElement GLAMSTracker(WebDriver driver) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://glams521qa.glams.ie/");
		Thread.sleep(5000);
		System.out.println("Launched Chrome Browser with 5.3 GLAMS");

		WebElement element = driver.findElement(By.name("UserName"));
		element.sendKeys("Hariprasad");
		driver.findElement(By.id("Password")).sendKeys("Perigord9!");
		driver.findElement(By.id("login_submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("vpin1")).sendKeys("7");
		driver.findElement(By.id("vpin2")).sendKeys("7");
		driver.findElement(By.id("vpin3")).sendKeys("7");
		driver.findElement(By.xpath("//*[@value = 'Submit']")).click();
		Thread.sleep(5000);
		System.out.println("GLAMS Home Page");

		element = driver.findElement(By.xpath("//a[@title='GLAMS Tracker']"));
		element.click();
		System.out.println("Clicked on Tracker menu bar");
		element1 = driver.findElement(By.xpath("//a[@title='GLAMS Component Tracker']"));
		element1.click();
		Thread.sleep(5000);
		element2 = driver.findElement(By.xpath("//input[@name='grid_search_input']"));
		element2.sendKeys("14");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@class='k-selectable']/tbody[1]/tr[1]/td[2]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='atm-modal-ajax ng-binding ng-isolate-scope'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Job Control']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='Comments']")).sendKeys("Releasing this compoent");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='BtnRelease']")).click();
		System.out.println("COmponent Released");
		Thread.sleep(10000);
		driver.quit();

		Thread.sleep(2000);
		return element;
	}
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
//		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName
//				+ ".png";
		String destination = "C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Pictures\\Screenshots\\New folder\\Eclipse failed sceensots\\"
				+ screenshotName + dateName + ".png";

		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
//	 @AfterMethod
//	    public static void tearDown() {
//	        driver.quit();
//	    }
	public void tearDown(ITestResult result) throws IOException, Exception {

		if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in
																							// extent report

			String screenshotPath = TrackerHoldToRelease.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); // to add screenshot in extent
																							// report
			// extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath));
			// //to add screencast/video in extent report
		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

		}

		extent.endTest(extentTest);
		// ending test and ends the current test and prepare to create html report
		if (driver != null) {
            driver.quit();
        }
	}

}
