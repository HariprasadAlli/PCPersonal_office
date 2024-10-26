package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTestNG_1 {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://glams53qa.glams.ie/Login?returnUrl=%2FRequest%3FType%3DDefault%26taskName%3DDashboard");
		driver.manage().window().maximize();
	}

	@Test
	public void VerifyWebTitle() {
		String ActualWebTitle = driver.getTitle();
		String ExpectedWebTitle = "https://glams53qa.glams.ie/Login?returnUrl=%2FRequest%3FType%3DDefault%26taskName%3DDashboard";
		Assert.assertEquals(ActualWebTitle, ExpectedWebTitle);
	}

	@AfterMethod
	public void Aftermethod(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotfile, new File(
					"C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\eclipse-java-2023-06-R-win32-x86_64\\eclipse\\Screenshots\\failure.png"));
		}
	}

}
