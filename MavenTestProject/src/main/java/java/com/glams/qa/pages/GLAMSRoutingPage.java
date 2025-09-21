package com.glams.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.glams.qa.base.TestBase;

public class GLAMSRoutingPage extends TestBase {

	@FindBy(xpath = "(//*[text()='Dashboard '])[1]")
	WebElement Dashboard;

	@FindBy(xpath = "(//input[@name='grid_search_input'])[1]")
	WebElement SearchBar;

	@FindBy(xpath = "(//button[@name='grid_search_button'])[1]")
	WebElement Binoculas;

	@FindBy(xpath = "((//table[@class='k-selectable'])//tr[1]//td[@role='gridcell']/a)[1]")
	WebElement FirstPartNumber;

	@FindBy(xpath = "//button[@data-autoname='Sheduler']")
	WebElement SchedulerButton;

	@FindBy(xpath = "//button[@ng-show='btnRoutingSubmit.Properties.Visible && !stageTaskList.IsNeedReCal']")
	WebElement ApplyChangesAndSubmitButton;

	@FindBy(xpath = "//input[@name='OK']")
	WebElement AcceptOkToSubmitRouting;

	public GLAMSRoutingPage() {
		PageFactory.initElements(driver, this);
	}

	public void NavigatetoDashboard() {
		wait.until(ExpectedConditions.elementToBeClickable(Dashboard)).click();
	}

	public void RoutingSearch() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(SearchBar)).click();
		SearchBar.sendKeys(prop.getProperty("comment"));
		wait.until(ExpectedConditions.elementToBeClickable(Binoculas)).click();
		Thread.sleep(2000);
	}

	public void OpenRoutingJob() throws Exception {

		wait.until(ExpectedConditions.elementToBeClickable(FirstPartNumber)).click();
	}

	public void SubmitRouting() throws Exception {
		Thread.sleep(9000);
		wait.until(ExpectedConditions.elementToBeClickable(SchedulerButton)).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(ApplyChangesAndSubmitButton)).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(AcceptOkToSubmitRouting)).click();
	}

}
