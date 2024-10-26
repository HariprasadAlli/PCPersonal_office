package GLAMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.CreateComponent;

public class LoginToGLAMS {
    public WebDriver driver;

    public static void main(String[] args) {
        LoginToGLAMS loginInstance = new LoginToGLAMS();
        try {
            WebDriver driver = loginInstance.login();
            
            // Now, you can call the CreateComponent class
            CreateComponent createComponent = new CreateComponent();
            createComponent.createComponentPage(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public WebDriver login() throws Exception {
        // Use WebDriverManager to set up the ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Create a WebDriver instance using ChromeDriver
        driver = new ChromeDriver();

        // Navigate to a website
        driver.manage().window().maximize();
        driver.get("https://glams53qa.glams.ie");
        driver.findElement(By.id("UserName")).sendKeys("hariprasad");
        driver.findElement(By.id("Password")).sendKeys("Perigord1!");
        driver.findElement(By.id("login_submit")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("vpin1")).sendKeys("7");
        driver.findElement(By.id("vpin2")).sendKeys("7");
        driver.findElement(By.id("vpin3")).sendKeys("7");
        driver.findElement(By.xpath("//*[@value = 'Submit']")).click();
        Thread.sleep(5000);
        System.out.println("Browser for GLAMS Launched");
        return driver;
    }
}
