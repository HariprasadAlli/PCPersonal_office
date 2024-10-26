package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SearchComponentTracker {

		


			public static void main(String agrs[]) throws Exception {
				ChromeLaunchMethod CLM=new ChromeLaunchMethod();
				WebDriver driver = CLM.Login();
				System.out.println("Executed");
				Thread.sleep(5000);
				//Open GLAMS Component Tracker Page
				WebElement GlamsAddNew = driver.findElement(By.xpath("//*[text()='GLAMS Tracker']"));
				GlamsAddNew.click();
				driver.findElement(By.xpath("//a[text()='GLAMS Component Tracker']")).click();
				Thread.sleep(15000);
				
				//move cursor aside
				WebElement elementToMoveTo = driver.findElement(By.xpath("//*[@class='section-title ng-binding']"));
		        Actions actions = new Actions(driver);
		        actions.moveToElement(elementToMoveTo).perform();
				
		        // search for component Part Number
		        driver.findElement(By.xpath("//*[@name='grid_search_input']")).sendKeys("21556-01");
		        driver.findElement(By.xpath("//*[@name='grid_search_button']")).click();
		        
		        // Success Message
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        Thread.sleep(5000); 
		        WebElement element = driver.findElement(By.xpath("//*[contains(text(), '1-1 of 1 items')]"));
		        if (element.isDisplayed()) {
		            System.out.println("Found you Job");
		        } else {
		            System.out.println("Not Found you Job");
		        }
		        
	
		        WebElement firstElement = driver.findElement(By.xpath("//a[@class='atm-modal-ajax ng-binding ng-isolate-scope' and contains(text(), 'P-21556-01')]"));
		        firstElement.click();
		        
		        
		        WebElement SupDowEle = driver.findElement(By.xpath("(//button[@class='btn btn-secondary btn-sm ng-binding ng-scope' and @ng-if='Download.Properties.Visible' and @ng-click='download()' and @name='btnDownload'])[1]"));
		        SupDowEle.click();
		        Thread.sleep(5000);
		        
		        
		        WebElement okButton = driver.findElement(By.name("OK"));
		        okButton.click();
		        
		        // Scroll down to 3/4
		        // Get the page height
		        long pageHeight = (Long) ((JavascriptExecutor) driver).executeScript("return Math.max( document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight );");

		        // Calculate the three-fourths point
		        long threeFourthsPoint = (3 * pageHeight) / 4;

		        // Find an element near the three-fourths point on the page
		        WebElement element1 = driver.findElement(By.xpath("//footer")); // Replace this with an appropriate element on your page.

		        // Create Actions class instance
		        Actions actions1 = new Actions(driver);

		        // Scroll to the element, applying an offset to reach three-fourths point
		        actions1.moveToElement(element1, 0, (int) -((pageHeight - threeFourthsPoint))).perform();
		        
		        
		        
		        driver.quit();
		        /* separate frame
		        // window pop-up Handle
		        WebElement modalContent = driver.findElement(By.cssSelector("div.modal-content"));
		        driver.switchTo().frame(modalContent);
		        WebElement okButton = driver.findElement(By.name("OK"));
		        okButton.click();
		        // Switch back to the main window (if needed)
		        driver.switchTo().defaultContent();
		        Thread.sleep(5000);
		        */
		        
		        
	}
			
}
