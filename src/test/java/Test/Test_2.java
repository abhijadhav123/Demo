package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 extends Baseclass {
	
	
	@Test 
	public void Test2() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Abhi");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
	
}
