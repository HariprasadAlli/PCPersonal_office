package restart1.restart1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day3_iFrame {
	public static void main(String[] args) throws Exception {

		// Setup ChromeDriver automatically
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		// Browser setup
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.name("mytext1")).sendKeys("abc");
		Thread.sleep(2000);
		
		

		

		driver.quit();
	}
}
