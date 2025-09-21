package testing.glams;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class accessglams {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\Practise\\testing.glams\\target\\Server\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://glams521qa.glams.ie/");
		driver.manage().window().maximize();
		driver.get("https://glams521qa.glams.ie/");
	}

}