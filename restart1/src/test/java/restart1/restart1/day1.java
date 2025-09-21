package restart1.restart1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {
	public static void main(String[] args) throws Exception {

		// Setup ChromeDriver automatically
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		// Browser setup
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://www.nseindia.com/market-data/live-market-indices");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//td[text()='24,868.60']//preceding::td//child::a")).click();

		// Print page title
		System.out.println("Page Title: " + driver.getTitle());
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for(int i = 0; i <list.size(); i++ ) {
			System.out.println(list.get(i).getText());
		}

		Thread.sleep(5000);

		driver.quit();
	}
}
