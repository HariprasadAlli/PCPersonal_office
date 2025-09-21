package com.glams.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.glams.qa.base.TestBase;
import com.glams.qa.pages.DashboardPage;
import com.glams.qa.pages.GLAMSArtworkUploadPage;
import com.glams.qa.pages.GLAMSComponentRequestPage;
import com.glams.qa.pages.GLAMSFinalApprovalPage;
import com.glams.qa.pages.LoginPage;

public class GLAMSEntireWorkFlow extends TestBase {
	
    LoginPage loginPage;
    DashboardPage dashboardPage;
    GLAMSComponentRequestPageTest glamsComponentRequestPageTest;
    GLAMSArtworkPageTest glamsArtworkPageTest;
    GLAMSFinalApprovalPageTest glamsFinalApprovalPageTest;
    GLAMSComponentRequestPage glamsComponentRequestPage;

	public GLAMSEntireWorkFlow() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		loginPage.clickOpenMenu();
		loginPage.clickFrenchtoEnglish();
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"), 7, 7, 7);
		glamsComponentRequestPage = dashboardPage.clickOnGLAMSComponentRequestPage();
		glamsComponentRequestPageTest = new GLAMSComponentRequestPageTest();
		glamsArtworkPageTest = new GLAMSArtworkPageTest();
		glamsFinalApprovalPageTest = new GLAMSFinalApprovalPageTest();
		
	}

	@Test
	public void ArtworkUploadSubmit() throws Exception {

		glamsComponentRequestPageTest.allMandatoryfieldsInRequestPage();
		glamsArtworkPageTest.ArtworkUploadSubmit();
		glamsFinalApprovalPageTest.FinalApprovalSubmit();
		

	}


}
