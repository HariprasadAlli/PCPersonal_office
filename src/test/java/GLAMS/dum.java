package GLAMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dum {
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hariprasad.alli\\Downloads\\chromedriver-win64 (4).zip\\chromedriver-win64\\chromedriver.exe");
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
