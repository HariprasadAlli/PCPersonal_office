package com.glams.qa.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.glams.qa.pages.DashboardPage;
import com.glams.qa.pages.GLAMSComponentRequestPage;
import com.glams.qa.pages.GLAMSComponentTrackerPage;
import com.glams.qa.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class SampleTestcase3 extends DashboardPage {
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;
	DashboardPage dashboardPage;
	LoginPage loginPage;
	GLAMSComponentRequestPage glamsComponentRequestPage;
	GLAMSComponentTrackerPage glamsComponentTrackerPage;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\Practise\\testing.glams\\target\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate()
				.to("https://glams6qa.glams.ie/Login?returnUrl=%2FRequest%3FType%3DDefault%26taskName%3DDashboard");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void GLAMS() throws Exception {

		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Hariprasad");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Perigord2!");

		driver.findElement(By.xpath("//button[@id='login_submit']")).click();
		driver.findElement(By.xpath("//*[@title='Dashboard']")).click();

		driver.findElement(By.xpath("//a[@title='My Dashboard']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		for (int i = 0; i < linklist.size(); i++) {
			String linklis1 = linklist.get(i).getText();
			System.out.println("Link Text [" + i + "]: '" + linklis1 + "'");
		}

		driver.close();
	}

}
