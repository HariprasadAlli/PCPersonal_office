package test;

import test.ComponentRequestTest;
import page.TrackerHoldToRelease;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.ComponentRequestPage;
import page.GLAMSLoginPage;
import page.TrackerHoldToRelease;

public class GLAMSLoginAllPagesTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void testGLAMSLogin() {
        try {
            GLAMSLoginPage.ChromeLaunch(driver);
            GLAMSLoginPage.GLAMSComponentPage(driver);
            TrackerHoldToRelease.GLAMSTracker(driver);
            // ComponentRequestTest.ComponentRequest(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


//public class GLAMSLoginAllPagesTest {
//
//	private static WebDriver driver=new ChromeDriver();
//	
//	private static ChromeOptions chromeOptions = new ChromeOptions();
//	
//	public static void main(String[] args) throws Exception {
//			ChromeLaunchTest();
//			
//		
//	}
//	
//	@Test 
//	public static void ChromeLaunchTest() throws Exception {
//		chromeOptions.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(chromeOptions);
//		GLAMSLoginPage.ChromeLaunch(driver);
//		GLAMSLoginPage.GLAMSComponentPage(driver);
//		TrackerHoldToRelease.GLAMSTracker(driver);
//		// ComponentRequestTest.ComponentRequest(driver);
//
//	}
//	
//	
//
//}
