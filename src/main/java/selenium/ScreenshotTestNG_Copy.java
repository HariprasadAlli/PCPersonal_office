package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotTestNG_Copy {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://glams53qa.glams.ie/Login?returnUrl=%2FRequest%3FType%3DDefault%26taskName%3DDashboard");
		driver.manage().window().maximize();
	}

}
