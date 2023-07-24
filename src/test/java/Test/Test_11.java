package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_11 {
	WebDriver driver;
	@BeforeMethod
	public void BM() {
	
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	
	public void Verifytitle() {
		String actualtitle=driver.getTitle();
		String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actualtitle, expectedtitle);
		
		System.out.println(actualtitle);
		
	}
	
	
	@Test
	
	public void search() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.name("field-keywords")).sendKeys("Abhi");
	}
	
	@Test
	
	public void logo() {
		
		boolean flag=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void AM() {
		driver.quit();
	}
}
