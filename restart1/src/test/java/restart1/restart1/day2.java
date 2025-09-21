package restart1.restart1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day2 {
	public static void main(String[] args) throws Exception {

		// Setup ChromeDriver automatically
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		// Browser setup
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://practice.expandtesting.com/dropdown");
		Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.id("dropdown")));
		s.selectByIndex(1);
		
//		Thread.sleep(1000);
//		s.deselectByIndex(1);
//		Thread.sleep(1000);
//		s.selectByValue("1");
//		Thread.sleep(1000);
		for(WebElement option: s.getOptions()) {
			System.out.println(option.getText());
		}
		s.deselectByValue("1");
		Thread.sleep(1000);
		s.selectByVisibleText("Option 1");
		Thread.sleep(1000);
		s.deselectByVisibleText("Option 1");
		Thread.sleep(1000);
		

		

		driver.quit();
	}
}
