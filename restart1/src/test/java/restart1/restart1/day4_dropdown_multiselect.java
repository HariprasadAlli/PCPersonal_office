package restart1.restart1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_dropdown_multiselect {
	public static void main(String[] args) throws Exception {

		// Setup ChromeDriver automatically
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		// Browser setup
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Navigate to URL
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]"));
		element.click();
		
		driver.findElement(By.xpath("(//*[text()='Green'])[2]")).click();
		driver.findElement(By.xpath("(//*[text()='Blue'])[2]")).click();
		
		 // ✅ Capture selected items from chips (above the dropdown box)
		List<String> expected = Arrays.asList("Green", "Blue");
        List<WebElement> selectedChips = driver.findElements(By.xpath("//div[contains(@class,'css-12jo7m5')]"));
        
        List<String> actual = selectedChips.stream()
                                           .map(WebElement::getText)
                                           .collect(Collectors.toList());

        System.out.println("Selected values: " + actual);

        // ✅ Assertion
        Assert.assertTrue(actual.contains("Green"), "Green is not selected!");
        Assert.assertTrue(actual.contains("Blue"), "Blue is not selected!");
        Assert.assertEquals(actual, expected, "Dropdown values are not as expected!");

		
		
		
		

		

		//driver.quit();
	}
}
