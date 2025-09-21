package restart1.restart1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

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

public class day4_WindowsHandlewindow {
	public static void main(String[] args) throws Exception {

		// Setup ChromeDriver automatically
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		// Browser setup
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html	");
		Thread.sleep(2000);
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window Handle- " + parentWindowHandle + driver.getTitle());
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abc");
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("abc");
		
		
		
		
	}
}
