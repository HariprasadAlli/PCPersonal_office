package ExcelGetData.ExcelGetData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingExcel {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		File src = new File(
				"C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\Practise\\ExcelGetData\\GLAMSCrds.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// load worksheet
		XSSFSheet sh = wb.getSheet("sheet1");

		// Print the loaded sheet name
		System.out.println(sh.getSheetName());

		// print username from excel
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());

		// print by from cell
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());

		// Print Total Number of Rows - 1st way
		System.out.println("Total no of Rows: " + sh.getPhysicalNumberOfRows());

		// Print Total Number of Rows - 2st way
		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getFirstRowNum());
		int rows = (sh.getLastRowNum() - sh.getFirstRowNum());
		System.out.println("Total rows: " + rows);
		// print toatal no. of rows -3rd way
		System.out.println("Total Rows: " + sh.getLastRowNum());

		// Print Total no. of Columns - 1st way
		System.out.println("Total Columns: " + sh.getRow(0).getPhysicalNumberOfCells());

		// Print Total no. of columns - 2nd way
		System.out.println("Total Columns: " + sh.getRow(0).getLastCellNum());

		WebDriverManager.chromedriver().setup();

		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hariprasad.alli\\OneDrive - Perigord Premedia Ltd\\Documents\\Eclipse\\Practise\\ExcelGetData\\chromedriver.exe");

		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://glams53qa.glams.ie/");
		Thread.sleep(5000);

		String a = sh.getRow(1).getCell(0).getStringCellValue();
		String b = sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("UserName")).sendKeys(a);
		driver.findElement(By.id("Password")).sendKeys(b);

	}

}
