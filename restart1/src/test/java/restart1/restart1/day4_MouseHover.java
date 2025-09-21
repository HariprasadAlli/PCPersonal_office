package restart1.restart1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_MouseHover {
	public static void main(String[] args) throws Exception {

		// Setup ChromeDriver automatically
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		// Browser setup
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://practice-automation.com/hover/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//h3[@onmouseover='mouseOver()']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Assert.assertEquals(element.getText(), "You did it!", "message not matched");
		System.out.println("passed");
		
		
		
		driver.quit();
	}
}
