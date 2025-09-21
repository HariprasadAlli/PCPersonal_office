package com.glams.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.glams.qa.base.TestBase;
import com.glams.qa.pages.DashboardPage;
import com.glams.qa.pages.GLAMSArtworkUploadPage;
import com.glams.qa.pages.LoginPage;

public class GLAMSArtworkPageTest extends TestBase {
	LoginPage loginPage;
	GLAMSArtworkUploadPage glamArtworkUploadPage;
	DashboardPage dashboardPage;

	public GLAMSArtworkPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		loginPage.clickOpenMenu();
		loginPage.clickFrenchtoEnglish();
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"), 7, 7, 7);
		glamArtworkUploadPage = new GLAMSArtworkUploadPage();
	}

	@Test
	public void ArtworkUploadSubmit() throws Exception {

		glamArtworkUploadPage.NavigatetoDashboard();
		glamArtworkUploadPage.ArtworkSearch();
		glamArtworkUploadPage.OpenArtworkJobAndUploadFile();
		glamArtworkUploadPage.CredentialsEnter();
		glamArtworkUploadPage.JobSubmit();

	}

}
