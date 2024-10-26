package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavToGLAMSRequestPage {


		public static void main(String agrs[]) throws Exception {
			ChromeLaunchMethod CLM=new ChromeLaunchMethod();
			WebDriver driver = CLM.Login();
			System.out.println("Executed");
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			WebElement GlamsAddNew = driver.findElement(By.xpath("//a[text()='GLAMS Add New']"));
			GlamsAddNew.click();
			driver.findElement(By.xpath("//a[text()='GLAMS Component']")).click();
			Thread.sleep(5000);
			
			driver.quit();
			
			
			

		}

}


