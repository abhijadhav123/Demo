package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {
	
	@Test
	public  void test_read() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		String Path="C:\\Users\\admin\\eclipse-workspace\\Test_project\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(Path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		String testdata=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String testdata1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(testdata);
		
		WebElement emailaddress=driver.findElement(By.name("email"));
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("pass"));
		emailaddress.sendKeys(testdata);
		password.sendKeys(testdata1);
		
		
	}

}
