package com.glams.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleScreenshot {

	public static WebDriver driver;

	public class ScreenshotListener implements ITestListener {

		@Override
		public void onTestFailure(ITestResult result) {
			try {
				SampleScreenshot.getScreenshot(SampleScreenshot.driver, result.getName());
				System.out.println("Screenshot taken for failed test: " + result.getName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String getScreenshot(WebDriver driver, String ScreenshotName) throws IOException {
	    String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File Source = ts.getScreenshotAs(OutputType.FILE);

	    // Set folder path
	    String folderPath = System.getProperty("user.dir") + "/FailedTestsScreenshots";
	    
	    // Check if folder exists, if not, create it
	    File folder = new File(folderPath);
	    if (!folder.exists()) {
	        folder.mkdirs();
	    }

	    // Set destination path
	    String destination = folderPath + "/" + ScreenshotName + "_" + dateName + ".png";
	    File finalDestination = new File(destination);
	    FileUtils.copyFile(Source, finalDestination);

	    return destination;
	}

	@BeforeMethod
	public static void launchGoogle() {
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

	}

	@Test
	public static void glamsOpen() {
		driver.get("https://glams6qa.glams.ie/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.navigate()
				.to("https://glams6qa.glams.ie/Login?returnUrl=%2FRequest%3FType%3DDefault%26taskName%3DDashboard");

		System.out.println("who are youl;");

		driver.findElement(By.xpath("//button[@id='open-menu']")).click();
		driver.findElement(By.xpath("//ul[@id='language-menu']//li//a[text()='English ']")).click();

		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Haripradassad");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Perigord2!ff");
		driver.findElement(By.xpath("//button[@id='login_submit']")).click();
		driver.findElement(By.id("vpin1")).sendKeys("7");
		driver.findElement(By.id("vpin2")).sendKeys("7");
		driver.findElement(By.id("vpin3")).sendKeys("7");
		driver.findElement(By.xpath("//*[@value = 'Submit']")).click();
		driver.quit();

	}

}
