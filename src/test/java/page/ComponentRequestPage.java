package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;

public class ComponentRequestPage {

	private static WebElement element = null;
	private static WebElement element1 = null;
	private static WebElement element2 = null;
	
	
	
	public static WebElement GLAMSAddNew(WebDriver driver) throws Exception {
		element = driver.findElement(By.xpath("//a[@title='GLAMS Add New']"));
		System.out.println("Clicked on Add New from Menu bar");
		Thread.sleep(2000);
		return element;
	}

	public static WebElement GLAMSComponentPage(WebDriver driver) throws Exception {
		element = driver.findElement(By.xpath("//a[@title='GLAMS Component']"));
		Thread.sleep(2000);
		System.out.println("I Entered in to GLAMS Component Request Page");
		return element;
		
	}

	public static WebElement GLAMSComponentName(WebDriver driver) throws Exception {
		element = driver.findElement(By.xpath("//input[@data-autoname='GLAMS Component Name']"));
		element.click();
		element.sendKeys("Text");
		Thread.sleep(2000);
		System.out.println("Entered Name");
		return element;
	}

	public static WebElement GLAMSComponentType(WebDriver driver) throws Exception {
		element = driver.findElement(By.xpath("(//span[text()='select'])[1]"));
		element.click();
		System.out.println("Clicked on Type Dropdown");
		Thread.sleep(2000);
		element1 = driver.findElement(By.xpath("//li[text()='Blister']"));
		Thread.sleep(5000);
		element1.click();
		Thread.sleep(2000);
		System.out.println("Entered Blister");
		return element;
	}

	public static WebElement GLAMSCountry(WebDriver driver) throws Exception {
		element = driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]"));
		element.click();
		System.out.println("Clicked on Country Dropdown");
		Thread.sleep(2000);
		element1 = driver.findElement(By.xpath("//li[normalize-space()='Alamass']"));
		element1.click();
		element2 = driver.findElement(By.xpath("//h2[@class='section-title ng-binding']"));
		element2.click();
		System.out.println("Entered COuntry");
		Thread.sleep(5000);
		return element;
	}

	public static WebElement ClickSubmitToRouting(WebDriver driver) {
		element = driver.findElement(By.name("btn Save & Submit to Routing"));
		element.click();
		System.out.println("Job Created");
		return element;
	}
	

}
