package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateComponent {
	public static void main(String args[]) throws Exception {
		CreateComponent CC = new CreateComponent();
		WebDriver driver = CC.ComponentPage();

	}

	public WebDriver ComponentPage() throws Exception {
		ChromeLaunchMethod CLM = new ChromeLaunchMethod();
		WebDriver driver = CLM.Login();
		System.out.println("Launched GLAMS");
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[@title='GLAMS Add New']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='GLAMS Component']")).click();	
		Thread.sleep(5000);
		
		
		// GLAMS Component Type as Blister
		WebElement Componentdropdown = driver.findElement(By.xpath("(//*[@class='k-input ng-scope'])[1]"));
		Componentdropdown.click();
		Thread.sleep(2000);
		WebElement blisterOption = driver.findElement(By.xpath("//li[text()='Blister']"));
		blisterOption.click();
		
		Thread.sleep(5000);
		
		// GLAMS Country = Alamass
		WebElement Countrydropdown = driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]"));
		Countrydropdown.click();
		Thread.sleep(2000);
		WebElement AlamassOption = driver.findElement(By.xpath("//li[text()='Alamass']"));
		AlamassOption.click();
		System.out.println("Entered GLAMS Country");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctrle67897b93ddf479cb472717579ff7616']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctrle67897b93ddf479cb472717579ff7616']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ctrl1ed70e5bc83b4d17b5f915faccbb5a1b']")).click();	
		Thread.sleep(2000);
		System.out.println("Job Created");

		return driver;

	}

}
