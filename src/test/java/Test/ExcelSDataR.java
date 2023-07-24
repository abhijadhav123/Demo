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

public class ExcelSDataR {
	
	@Test
	
	public void test_r() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String path="C:\\Users\\admin\\eclipse-workspace\\Test_project\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb= new XSSFWorkbook(file);
		 String B1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String B2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		WebElement emailaddress=driver.findElement(By.name("email"));
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("pass"));
		
		emailaddress.sendKeys(B1);
		password.sendKeys(B2);
		return data;
		
		
	}
	
	
	
	

}
