package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.TrackerHoldToRelease;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TrackerHoldToReleaseTest {

    // If you are using TestNG's dependency injection for WebDriver, you can annotate it with @Parameters and @BeforeTest
    // Or, you can initialize it inside the test method if needed.
    // For simplicity, I'm assuming you'll initialize it inside the test method.

    @Test
    public void testGLAMSLogin() throws Exception {
        WebDriver driver = initializeWebDriver(); // You need to initialize the driver here

        // Call the static method using the class name
        TrackerHoldToRelease.GLAMSTracker(driver);
        
        // Don't forget to close/quit the WebDriver instance after the test
        driver.quit();
    }

    // Initialize WebDriver if needed (example only, modify based on your actual setup)
    private WebDriver initializeWebDriver() {
        // Add your WebDriver setup logic here (e.g., initialize ChromeDriver, set options, etc.)
        return null; // Return the initialized WebDriver instance
    }
}
