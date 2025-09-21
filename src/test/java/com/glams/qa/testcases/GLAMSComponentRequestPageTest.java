package com.glams.qa.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.glams.qa.base.TestBase;
import com.glams.qa.pages.DashboardPage;
import com.glams.qa.pages.GLAMSArtworkUploadPage;
import com.glams.qa.pages.GLAMSComponentRequestPage;
import com.glams.qa.pages.LoginPage;
import com.glams.qa.util.RandomVariables;

public class GLAMSComponentRequestPageTest extends TestBase {

	LoginPage loginPage;
	DashboardPage dashboardPage;
	GLAMSComponentRequestPage glamsComponentRequestPage;

	public GLAMSComponentRequestPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		loginPage.clickOpenMenu();
		loginPage.clickFrenchtoEnglish();
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"), 1, 1, 1);
		glamsComponentRequestPage = dashboardPage.clickOnGLAMSComponentRequestPage();

	}

	@Test
	public void allMandatoryfieldsInRequestPage() throws Exception {
		implicitwait();
		String generatedPartNumber = RandomVariables.getRandomVariable(); // Get generated value
		System.out.println("Generated Part Number for use: " + generatedPartNumber); // Return value for reuse

		glamsComponentRequestPage.GLAMSComponentTypeDropDown();
		Thread.sleep(2000);
		glamsComponentRequestPage.GLAMSCountryDropDown();
		Thread.sleep(2000);
		glamsComponentRequestPage.GLAMSProductNameDropDown();
		Thread.sleep(2000);
//		glamsComponentRequestPage.GLAMSPackagingSiteDropDown();

//		glamsComponentRequestPage.GLAMSCurrentPackagingCodeInputField("123456");
//
//		glamsComponentRequestPage.GLAMSComments();
//		glamsComponentRequestPage.printsomething();
//		System.out.println("111");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);

		// Scroll down using PAGE_DOWN key
		actions.sendKeys(Keys.PAGE_DOWN).perform();

		Thread.sleep(3000);
		glamsComponentRequestPage.GLAMSComments(generatedPartNumber);
		glamsComponentRequestPage.GLAMSSaveSubmitbutton();
		
//		 // Now use the same generatedPartNumber in Artwork Search
//	    GLAMSArtworkUploadPage artworkUploadPage = new GLAMSArtworkUploadPage();
//	    artworkUploadPage.ArtworkSearch(generatedPartNumber);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
