package GLAMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateComponent {
    public void createComponentPage(WebDriver driver) throws Exception {
        System.out.println("Launched GLAMS");

        // Add some waiting time (5 seconds) to ensure the page fully loads
        Thread.sleep(5000);

        // Click on the 'GLAMS Component' link
        driver.findElement(By.xpath("//a[@title='GLAMS Component']")).click();

        // Add some more waiting time (5 seconds) for the next step
        Thread.sleep(5000);

        // Find the input element to enter Component Name and send keys "Demo"
        WebElement glamsAddNew = driver.findElement(By.xpath("//input[@id='ctrl14a2d04b58f14a97b94c788494e31c82']"));
        glamsAddNew.sendKeys("Demo");

        System.out.println("Component Created");
    }
}
