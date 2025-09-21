package com.glams.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.glams.qa.base.TestBase;
import com.glams.qa.pages.DashboardPage;
import com.glams.qa.pages.GLAMSFinalApprovalPage;
import com.glams.qa.pages.LoginPage;

public class GLAMSFinalApprovalPageTest extends TestBase {

	LoginPage loginPage;
	DashboardPage dashboardPage;
	GLAMSFinalApprovalPage glamsFinalApprovalPage;

	public GLAMSFinalApprovalPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		loginPage.clickOpenMenu();
		loginPage.clickFrenchtoEnglish();
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"), 7, 7, 7);
		glamsFinalApprovalPage = new GLAMSFinalApprovalPage();
	}

	@Test
	public void FinalApprovalSubmit() throws Exception {

		glamsFinalApprovalPage.NavigatetoDashboard();
		glamsFinalApprovalPage.FinalSearch();
		glamsFinalApprovalPage.OpenFinalApprovalJob();
		glamsFinalApprovalPage.EnterMandatoryFields();
		glamsFinalApprovalPage.FinalApprovalCredentials();
		glamsFinalApprovalPage.SubmitJob();

	}

}
