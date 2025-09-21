package com.glams.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.glams.qa.base.TestBase;

public class GLAMSArtworkUploadPage extends TestBase {
	
	@FindBy(xpath = "(//*[text()='Dashboard '])[1]")
	WebElement Dashboard;

	@FindBy(xpath = "(//input[@name='grid_search_input'])[1]")
	WebElement SearchBar;

	@FindBy(xpath = "(//button[@name='grid_search_button'])[1]")
	WebElement Binoculas;

	@FindBy(xpath = "((//table[@class='k-selectable'])//tr[1]//td[@role='gridcell']/a)[1]")
	WebElement FirstPartNumber;
	
	@FindBy(xpath = "//a[text()='Artwork Upload']")
	WebElement ArtworkUploadTab;
	
	@FindBy(xpath = "//a[text()=' Browse']")
	WebElement FileUpload; //C:\Users\hariprasad.alli\Downloads
	
	@FindBy(name = "UserName")
	WebElement UserName;
	
	
	@FindBy(name = "Password")
	WebElement Password;
	
	@FindBy(name = "Btn Upload & Submit")
	WebElement UploadAndSubmitbutton;
	
	
	
	public GLAMSArtworkUploadPage() {
		PageFactory.initElements(driver, this);//It binds the elements to their locators so they are ready for interaction.
	}

	public void NavigatetoDashboard() {
		wait.until(ExpectedConditions.elementToBeClickable(Dashboard)).click();
	}

	public void ArtworkSearch() throws Exception {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SearchBar)).click();
		Thread.sleep(2000);
		SearchBar.sendKeys();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Binoculas)).click();
		
		
	}

	public void OpenArtworkJobAndUploadFile() throws Exception {

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(FirstPartNumber)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(ArtworkUploadTab)).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
		WebElement fileInput = driver.findElement(By.xpath("//input[@name='file']"));
		fileInput.sendKeys("C:\\Users\\hariprasad.alli\\Downloads\\Atelnol25mg  (5).pdf"); 
		Thread.sleep(5000);
	}
	
	public void CredentialsEnter() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(UserName)).sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Password)).sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
	}
	
	public void JobSubmit() {
		wait.until(ExpectedConditions.elementToBeClickable(UploadAndSubmitbutton)).click();
	}
	
	


}
