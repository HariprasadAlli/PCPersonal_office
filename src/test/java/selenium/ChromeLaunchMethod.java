package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunchMethod {
	
	public static WebDriver driver;

	public WebDriver Login() throws Exception{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("--remote-allow-origins=*");


		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\chromedriver.exe");
		driver = new ChromeDriver(chromeOptions);
	    
	    
	    
		
		driver.manage().window().maximize();
		driver.get("https://glams53qa.glams.ie/");
		driver.findElement(By.id("UserName")).sendKeys("hariprasad");
		driver.findElement(By.id("Password")).sendKeys("Perigord1!");
		driver.findElement(By.id("login_submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("vpin1")).sendKeys("7");
		driver.findElement(By.id("vpin2")).sendKeys("7");
		driver.findElement(By.id("vpin3")).sendKeys("7");
		driver.findElement(By.xpath("//*[@value = 'Submit']")).click();
		Thread.sleep(5000);
		System.out.println("Browser for GLAMS Launched");	
		return driver;

	}
	
	public static void main(String args[]) {
		Login
	}
	
}
