package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGLAMS2 {

    public static void main(String[] args) {
        // Set the system property for ChromeDriver
      
        // Initialize a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the specified URL
        driver.get("https://glams6qa.glams.ie/Login?returnUrl=%2FRequest%3FType%3DDefault%26taskName%3DDashboard");
        
        // Additional actions or clean-up can be added here, e.g., driver.quit();
    }
}
