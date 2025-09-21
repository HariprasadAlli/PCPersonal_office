package com.example.google;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDom {
	
	public static void main(String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement username = (WebElement)jse.executeScript("return document.querySelector(\"body > ntp-app\").shadowRoot.querySelector(\"#searchbox\").shadowRoot.querySelector(\"#input\")");
		
		String js = "arguments[0].setAtteibute('value', 'java')";
		jse.executeScript(js, username);
	}

}
