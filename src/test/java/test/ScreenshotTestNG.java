package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTestNG {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.qafox.com/");
		driver.manage().window().maximize();
		Reporter.log("Ended successfull");
		
	}

	@Test
	public void VerifyWebTitle() {
		String ActualWebTitle = driver.getTitle();
		String ExpectedWebTitle = "https://www.qafox.com/";
		Assert.assertEquals("Home - QAFox", "Home - QAFox");
		Reporter.log("Lgged in successfull");
	}

	@AfterMethod
	public void Aftermethod(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus())
		{
			Utility.TakingScreenshot(driver, result.getName());
		}
		
		driver.quit();
	}

}
