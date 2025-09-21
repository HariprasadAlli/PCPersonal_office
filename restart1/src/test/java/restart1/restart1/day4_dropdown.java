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
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_dropdown {
	public static void main(String[] args) throws Exception {

		// Setup ChromeDriver automatically
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		// Browser setup
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://www.qa-practice.com/elements/button/disabled");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("id_select_state"));
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);//true
		System.out.println("Present on webpage dropdown");
		
		System.out.println(element.isEnabled());//true
		System.out.println("Enabled on webpage dropdown");
		
		System.out.println(element.isSelected());//false
		System.out.println("not selected on web page");
		
		
		WebElement element1 = driver.findElement(By.id("submit-id-submit"));
		System.out.println(element1.isEnabled());//false
		System.out.println("button is disabled");
		
		
		
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Enabled");
		
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		Assert.assertNull(selectedOption, null)
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(selectedOption.getText(), "Enabled", "Dropdown value is not as expected");
//		
		
		
		System.out.println(element1.isEnabled());//true
		System.out.println("button is enabled");
		
		List<WebElement> selectedOptionq1 = dropdown.getAllSelectedOptions();
		System.out.println(selectedOptionq1);
		
		
		

		

		//driver.quit();
	}
}
