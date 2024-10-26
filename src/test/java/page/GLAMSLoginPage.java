package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GLAMSLoginPage {
	
	private static WebElement element = null;
	@BeforeSuite 
	public static WebElement ChromeLaunch(WebDriver driver) throws Exception {
		
		WebDriverManager.chromedriver().setup();
//		ChromeOptions chromeOptions = new ChromeOptions();
//	    chromeOptions.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://glams53qa.glams.ie/");
		Thread.sleep(5000);
		System.out.println("Launched Chrome Browser with 5.3 GLAMS");
		return element;
	}
	@BeforeTest(dependsOnMethods = "ChromeLaunch")
	public static WebElement GLAMSComponentPage(WebDriver driver) throws Exception {
		WebElement element = driver.findElement(By.name("UserName"));
		element.sendKeys("hariprasad");
		driver.findElement(By.id("Password")).sendKeys("Perigord1!");
		driver.findElement(By.id("login_submit")).click();
		Thread.sleep(5000);
//		driver.findElement(By.id("vpin1")).sendKeys("7");
//		driver.findElement(By.id("vpin2")).sendKeys("7");
//		driver.findElement(By.id("vpin3")).sendKeys("7");
//		driver.findElement(By.xpath("//*[@value = 'Submit']")).click();
		Thread.sleep(5000);
		System.out.println("GLAMS Home Page");
		return element;
	}


}
