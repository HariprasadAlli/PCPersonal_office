package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.ComponentRequestPage;


public class ComponentRequestTest {


	public static void main(String[] args) throws Exception {
		ComponentRequest();
	}
	
	

	public static void ComponentRequest() throws Exception {

		ComponentRequestPage.GLAMSAddNew(driver).click();
		ComponentRequestPage.GLAMSComponentPage(driver).click();
		ComponentRequestPage.GLAMSComponentName(driver).click();
		ComponentRequestPage.GLAMSComponentType(driver);
		ComponentRequestPage.GLAMSCountry(driver).click();
		ComponentRequestPage.ClickSubmitToRouting(driver).click();

	}

}
