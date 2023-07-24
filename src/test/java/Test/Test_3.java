package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
		WebElement login=driver.findElement(By.xpath("//div[text()='Log in']"));
		
		if(login.isEnabled()==true) {
			login.click();
		} else {
			System.out.println("login button disable");
		}
		
	}

}

