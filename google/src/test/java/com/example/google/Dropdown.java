package com.example.google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
		dropdown.selectByVisibleText("Option 1");
		System.out.println(dropdown.getFirstSelectedOption());
		String expected = "Option 1";
		String actual = dropdown.getFirstSelectedOption().getText();

		if (actual.equals(expected)) {
			System.out.println("✅ Test Passed: Expected = " + expected + ", Actual = " + actual);
		} else {
			System.out.println("❌ Test Failed: Expected = " + expected + ", but Actual = " + actual);
		}
		driver.close();
	}
}