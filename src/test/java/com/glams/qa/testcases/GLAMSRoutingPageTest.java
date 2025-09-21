package com.glams.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.glams.qa.base.TestBase;
import com.glams.qa.pages.DashboardPage;
import com.glams.qa.pages.GLAMSComponentRequestPage;
import com.glams.qa.pages.GLAMSRoutingPage;
import com.glams.qa.pages.LoginPage;

public class GLAMSRoutingPageTest extends TestBase {
	
	LoginPage loginPage;
	GLAMSRoutingPage glamsRoutingPage;
	DashboardPage dashboardPage;
	GLAMSComponentRequestPage glamsComponentRequestPage;

	public GLAMSRoutingPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		loginPage.clickOpenMenu();
		loginPage.clickFrenchtoEnglish();
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"), 7, 7, 7);
		glamsRoutingPage = new GLAMSRoutingPage();
	}

	@Test
	public void RoutingSubmit() throws Exception {
		
		glamsRoutingPage.NavigatetoDashboard();
		glamsRoutingPage.RoutingSearch();
		glamsRoutingPage.OpenRoutingJob();
		glamsRoutingPage.SubmitRouting();
		
	}
	

}
