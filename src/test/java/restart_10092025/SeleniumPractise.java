package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumPractise {
	public WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\Practise\\testing.glams\\target\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.navigate().to("https://www.nseindia.com/market-data/live-market-indices");
		Thread.sleep(5000);

	}

	@Test
	public void GLAMS() throws Exception {

		driver.findElement(By.linkText("/market-data/live-equity-market?symbol=NIFTY%2050")).click();

//		List<WebElement> linklist = driver.findElements(By.tagName("a"));
//		for (int i = 0; i < linklist.size(); i++) {
//			String linklis1 = linklist.get(i).getText();
//			System.out.println("Link Text [" + i + "]: '" + linklis1 + "'");
		}

		driver.close();
	}

}
