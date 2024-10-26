

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateComponent1 {
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

		// Open GLAMS Request Page
		WebElement GlamsAddNew = driver.findElement(By.xpath("//a[text()='GLAMS Add New']"));
		GlamsAddNew.click();
		driver.findElement(By.xpath("//a[text()='GLAMS Component']")).click();
		System.out.println("Entered GLAMS Component");
		Thread.sleep(5000);

		// move cursor aside
		WebElement elementToMoveTo = driver.findElement(By.xpath("//*[@class='section-title ng-binding']"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(elementToMoveTo).perform();

		// Enter Component Name
		driver.findElement(By.xpath("//*[@name='GLAMS Component Name']")).sendKeys("demo021");
		System.out.println("Entered Component Name");
		Thread.sleep(5000);

		// Enter Current Packaging code
		WebElement ele = driver.findElement(By.xpath("//input[@name='Current Packaging Code']"));
		ele.sendKeys("Demo011");
		System.out.println("Entered Packaging code");
		Thread.sleep(5000);
		
		// Choose country from dropdown
		
		/*
		WebElement GLAMSCountry = driver.findElement(By.xpath("(//div[@class='k-widget k-multiselect k-header ng-pristine ng-untouched ng-valid ng-scope ng-valid-parse'])[2]"));
		WebElement optionAlama = driver.findElement(By.xpath("//li[contains(text(), 'Alamass')]"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(GLAMSCountry).click().moveToElement(optionAlama).click().build().perform();
		System.out.println("Entered GLAMS Country");
		Thread.sleep(5000);
		*/
		
		Select GLAMSCountry = new Select(driver.findElement(By.xpath("(//div[@class='k-widget k-multiselect k-header ng-pristine ng-untouched ng-valid ng-scope ng-valid-parse'])[2]")));
		GLAMSCountry.selectByVisibleText("Alamass");
		

		// scroll up and scroll down
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(5000);
//
//		JavascriptExecutor jstop = (JavascriptExecutor) driver;
//		jstop.executeScript("window.scrollBy(0,-1000)");
//		Thread.sleep(5000);

		// Choose GLAMS Component type from dropdown
		
		/*
		WebElement inputElement1 = driver.findElement(By.xpath("(//*[@class='k-input ng-scope'])[1]"));
		inputElement1.click();
		WebElement optionBlister = driver.findElement(By.xpath("//li[contains(text(), 'Blister')"));
		System.out.println("Entered Component Type");
		optionBlister.click();
		*/
		/*
		WebElement GLAMSComponent= driver.findElement(By.xpath("(//*[@class='k-input ng-scope'])[1]"));
		WebElement optionBlister = driver.findElement(By.xpath("//li[contains(text(), 'Blister')]"));
		Actions actions3 = new Actions(driver);
		actions3.moveToElement(GLAMSComponent).click().moveToElement(optionBlister).click().build().perform();
		System.out.println("Entered GLAMS Component");
		Thread.sleep(5000);
		
		// move cursor aside
		//actions1.moveToElement(elementToMoveTo).perform();
		//Thread.sleep(5000);

		/*
		// Choose GLAMS Product Name
		WebElement ProductNameDropdown = driver.findElement(By.xpath("(//input[@class='k-input k-readonly'])[1]"));
		ProductNameDropdown.click();
		WebElement optionAcular = driver.findElement(By.xpath("//li[contains(text(), 'Abilitate Tabs')]"));
		optionAcular.click();
		System.out.println("Entered Product Name");
		Thread.sleep(5000);
		
		WebElement ProductNameDropdown= driver.findElement(By.xpath("(//*[@class='k-multiselect-wrap k-floatwrap'])[1]"));
		WebElement optionAbilitate = driver.findElement(By.xpath("//li[contains(text(), 'Abilitate')]"));
		Actions actions4 = new Actions(driver);
		actions4.moveToElement(ProductNameDropdown).click().moveToElement(optionBlister).click().build().perform();
		System.out.println("Entered GLAMS Component");
		Thread.sleep(5000);
		*/

		// Choose GLAMS Strength
		
		/*
		WebElement Strengthdropdown = driver.findElement(By.xpath("(//*[@class='k-input ng-scope'])[3]"));
		Strengthdropdown.click();
		WebElement option01729 = driver.findElement(By.xpath("//li[contains(text(), '0.01729')]"));
		option01729.click();
		System.out.println("Entered Strength");
		Thread.sleep(5000);
		*/
		/*
		WebElement Strengthdropdown = driver.findElement(By.xpath("(//*[@class='k-input ng-scope'])[2]"));
		WebElement optionStrength = driver.findElement(By.xpath("//li[contains(text(), '0.01729')]"));
		Actions actions5 = new Actions(driver);
		actions5.moveToElement(Strengthdropdown).click().moveToElement(optionStrength).click().build().perform();
		System.out.println("Entered Strength");
		Thread.sleep(5000);
		
		
		// Choose GLAMS Packaging site
		
		/*
		WebElement Packagingsitedropdown = driver.findElement(By.xpath("(//*[@class='k-input ng-scope'])[3]"));
		Packagingsitedropdown.click();
		WebElement optionCMO1 = driver.findElement(By.xpath("//li[contains(text(), 'CMO1')]"));
		optionCMO1.click();
		System.out.println("Entered Packaging site");
		Thread.sleep(5000);
		*/
		/*
		WebElement Packagingsitedropdown = driver.findElement(By.xpath("(//*[@class='k-input ng-scope'])[3]"));
		WebElement optionPackaging = driver.findElement(By.xpath("//li[contains(text(), 'CMO1')]"));
		Actions actions6 = new Actions(driver);
		actions6.moveToElement(Packagingsitedropdown).click().moveToElement(optionPackaging).click().build().perform();
		System.out.println("Entered Strength");
		Thread.sleep(5000);

		// Choose Artwork Studio
		
		/*
		WebElement ArtworkStudiodropdown = driver.findElement(By.xpath("(//*[@class='k-input ng-scope'])[4]"));
		ArtworkStudiodropdown.click();
		WebElement optionPA = driver.findElement(By.xpath("//li[contains(text(), 'Perigord_Afghanistan')]"));
		optionPA.click();
		System.out.println("Entered Artwork Studio");
		Thread.sleep(5000);
		*/
		/*
		WebElement ArtworkStudiodropdown = driver.findElement(By.xpath("(//*[@class='k-input ng-scope'])[4]"));
		WebElement optionPA = driver.findElement(By.xpath("//li[contains(text(), 'Perigord_Afghanistan')]"));
		Actions actions7 = new Actions(driver);
		actions7.moveToElement(ArtworkStudiodropdown).click().moveToElement(optionPA).click().build().perform();
		System.out.println("Entered Artwork studio");
		Thread.sleep(5000);
		

		// Choose Required end Date
		WebElement RequiredEnDDatedropdown = driver.findElement(By.xpath("(//*[@class='k-icon k-i-calendar'])"));
		RequiredEnDDatedropdown.sendKeys("20-Oct-2023");
		System.out.println("Entered Required End Date");
		Thread.sleep(5000);
		// WebElement optionRED =
		// driver.findElement(By.xpath("//a[@data-value='2023/10/22']"));
		// optionRED.clear();
		// optionRED.sendKeys("10-Oct-2023");

		// scroll down
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");

		
		 * // Choose HA Approval Date WebElement HAApprovaldropdown =
		 * driver.findElement(By.xpath("(//span[@class='k-icon k-i-calendar'])[3]"));
		 * HAApprovaldropdown.sendKeys("20-Oct-2023"); Thread.sleep(5000);
		 * System.out.println(""); WebElement optionHAApproval =
		 * driver.findElement(By.xpath("(//a[@data-value='2023/10/22'])[2]"));
		 * Thread.sleep(5000); optionHAApproval.click();
		 * 
		 * // Choose HA submission Date WebElement HASubmissiondropdown =
		 * driver.findElement(By.xpath("(//span[@class='k-icon k-i-calendar'])[4]"));
		 * HASubmissiondropdown.click(); Thread.sleep(5000); WebElement
		 * optionHASubmission =
		 * driver.findElement(By.xpath("(//a[@data-value='2023/10/22'])[3]"));
		 * Thread.sleep(5000); optionHASubmission.click();
		 * 
		 * // Comments HA Description WebElement HADescriptionTextfield =
		 * driver.findElement(By.xpath("//input[@name='Description']"));
		 * HADescriptionTextfield.sendKeys("HA"); Thread.sleep(5000);
		 */
		
		

		// Click on Save & Submit to Routing button
		WebElement SaveAndSubmitToRoutingButton = driver
				.findElement(By.xpath("//button[@name='btn Save & Submit to Routing']"));
		SaveAndSubmitToRoutingButton.click();

		System.out.println("Job Created");
		return driver;

	}

}
