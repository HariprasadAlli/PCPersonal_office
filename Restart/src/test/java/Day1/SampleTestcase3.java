package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestcase3 {
	public WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\chromedriver-win64 (10)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.navigate()
				.to("https://glams6qa.glams.ie/Login?returnUrl=%2FRequest%3FType%3DDefault%26taskName%3DDashboard");
		Thread.sleep(5000);

	}

	@Test
	public void GLAMS() throws Exception {

		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Hariprasad");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Perigord2!");

		driver.findElement(By.xpath("//button[@id='login_submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='Dashboard']")).click();

		driver.findElement(By.xpath("//a[@title='My Dashboard']")).click();

		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		for (int i = 0; i < linklist.size(); i++) {
			String linklis1 = linklist.get(i).getText();
			System.out.println("Link Text [" + i + "]: '" + linklis1 + "'");
		}

		driver.close();
	}

}
