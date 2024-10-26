package GLAMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewGlams {

	public static void main(String args[]) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\Practise\\testing.glams\\target\\Server\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("input[@id='UserName']")).click();
	driver.findElement(By.xpath("input[@id='UserName']")).sendKeys("Hariprasad");
	driver.findElement(By.xpath("input[@id='Password']")).click();
	driver.findElement(By.xpath("input[@id='Password']")).sendKeys("Perogord2!");
	
}
	
}