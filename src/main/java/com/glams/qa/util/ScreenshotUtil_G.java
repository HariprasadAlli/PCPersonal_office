package com.glams.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.glams.qa.base.TestBase;

public class ScreenshotUtil_G extends TestBase {

	public static void takeScreenshot(String testName) {
		// Format timestamp for unique file naming
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		// Capture screenshot
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Define screenshot storage path
		String destinationPath = System.getProperty("user.dir") + "/screenshots/" + testName + "_" + timestamp + ".png";

		try {
			FileUtils.copyFile(srcFile, new File(destinationPath));
			System.out.println("Screenshot saved: " + destinationPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
