package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotHandle {

    private static WebElement element = null;
    private static WebDriver driver; // Declare driver as a class variable

    public static void main(String args[]) throws Exception {
        ChromeLaunch(); // Change method signature to not pass driver
        takeScreenshot("GLAMS2");
        driver.quit();
    }

    public static void ChromeLaunch() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // Initialize driver here
        driver.manage().window().maximize();
        driver.get("https://glams53qa.glams.ie/");
        Thread.sleep(5000);
        System.out.println("Launched Chrome Browser with 5.3 GLAMS");
    }

    public static void takeScreenshot(String fileName) throws IOException {
        // 1. Take Screenshot and store it in file Format:
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // 2. Now copy the screenshot to the desired location by using copyfile method:
        FileUtils.copyFile(file, new File(
                "C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\Practise\\Selenium1\\src\\test\\java\\page\\"
                        + fileName + ".jpg"));
    }
}
