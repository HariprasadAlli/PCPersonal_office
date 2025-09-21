package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestChromeLaunch1 {

    public static void main(String[] args) throws Exception {
        // Set up ChromeOptions
    	System.out.println("1");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\chromedriver-win64 (10)\\chromedriver-win64\\chromedriver.exe");

        // Create a new WebDriver instance
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the first URL and print the page title
        driver.get("https://glams521qa.glams.ie/");
        System.out.println("Title 1: " + driver.getTitle());

        // Navigate to the second URL and perform login
        driver.get("https://glams521qa.glams.ie/Request?Type=AddJob&taskName=GLAMS%20Component%20Request&jobID=0");
        driver.findElement(By.id("UserName")).sendKeys("hariprasad");
        driver.findElement(By.id("Password")).sendKeys("Perigord1!");
        driver.findElement(By.id("login_submit")).click();
        driver.findElement(By.id("vpin1")).sendKeys("7");
        driver.findElement(By.id("vpin2")).sendKeys("7");
        driver.findElement(By.id("vpin3")).sendKeys("7");
        driver.findElement(By.cssSelector("[value='Submit']")).click();

        // Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Perform other actions
        Thread.sleep(5000);
        //driver.findElement(By.name("GLAMS Component Name")).sendKeys("demo1");
        driver.findElement(By.xpath("//*[@name='GLAMS Component Name']")).sendKeys("demo02");
        WebElement ele= driver.findElement(By.xpath("//input[@name='Current Packaging Code']"));
        ele.sendKeys("Demo01");
        
        WebElement dropdownElement = driver.findElement(By.xpath("//ul[@id='{{item.Id}}_taglist']"));

        // Create a Select object to work with the dropdown
        Select dropdown = new Select(dropdownElement);

        // Select the first value from the dropdown (index 0)
        dropdown.selectByIndex(0);

        // Optionally, you can retrieve the selected option to verify if it's the first value
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        System.out.println("Selected option: " + selectedOption.getText());
        
        //
//        Select glamsProductNameDropdown = new Select(driver.findElement(By.name("GLAMS Product Name")));
   //     glamsProductNameDropdown.selectByValue("0");

        Thread.sleep(2000);
        driver.quit();
    }
}
