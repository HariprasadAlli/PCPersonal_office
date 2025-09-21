package testglams;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class accessglams {
	
	public void accessglams1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://glams521qa.glams.ie/");
		driver.get("https://glams521qa.glams.ie/");
	}

}