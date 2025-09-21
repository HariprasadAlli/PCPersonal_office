package com.glams.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.glams.qa.base.TestBase;

public class GLAMSFinalApprovalPage extends TestBase {

	@FindBy(xpath = "(//*[text()='Dashboard '])[1]")
	WebElement Dashboard;

	@FindBy(xpath = "(//input[@name='grid_search_input'])[1]")
	WebElement SearchBar;

	@FindBy(xpath = "(//button[@name='grid_search_button'])[1]")
	WebElement Binoculas;

	@FindBy(xpath = "((//table[@class='k-selectable'])//tr[1]//td[@role='gridcell']/a)[1]")
	WebElement FirstPartNumber;

	@FindBy(xpath = "//a[text()='Artwork File']")
	WebElement ArtworkFileTab;

	@FindBy(name = "HA Submission Date")
	WebElement HASubmissionDate;

	@FindBy(name = "HA Comment")
	WebElement HAComment;

	@FindBy(name = "HA Approval Date")
	WebElement HAApprovalDate;

	@FindBy(name = "Final Approval Authenticity")
	WebElement CheckBoxForAuthenticate;

	@FindBy(name = "UserName")
	WebElement UserName;

	@FindBy(name = "Password")
	WebElement Password;

	@FindBy(name = "BTN-ApprovetoRep")
	WebElement ApproveToMoveToRepAlonebutton;
	
	@FindBy(name = "OK")
	WebElement OkayClick;

	public GLAMSFinalApprovalPage() {
		PageFactory.initElements(driver, this);
	}

	public void NavigatetoDashboard() {
		wait.until(ExpectedConditions.elementToBeClickable(Dashboard)).click();
	}

	public void FinalSearch() throws Exception {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SearchBar)).click();
		Thread.sleep(2000);
		SearchBar.sendKeys(prop.getProperty("comment"));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Binoculas)).click();

	}

	public void OpenFinalApprovalJob() throws Exception {

		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(FirstPartNumber)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(ArtworkFileTab)).click();
		Thread.sleep(2000);

	}

	public void EnterMandatoryFields() {
		wait.until(ExpectedConditions.elementToBeClickable(HASubmissionDate)).sendKeys("03-Apr-2025");
		wait.until(ExpectedConditions.elementToBeClickable(HAComment)).sendKeys("Comment For Test");
		wait.until(ExpectedConditions.elementToBeClickable(HAApprovalDate)).sendKeys("03-Apr-2025");

	}

	public void FinalApprovalCredentials() throws Exception {
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(CheckBoxForAuthenticate)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(UserName)).sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Password)).sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
	}

	public void SubmitJob() {
		wait.until(ExpectedConditions.elementToBeClickable(ApproveToMoveToRepAlonebutton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(OkayClick)).click();
	}

}
