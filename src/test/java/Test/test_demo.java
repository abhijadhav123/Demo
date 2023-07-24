package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("amol");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("123");
		//driver.findElement(By.name("login")).click();
	//	driver.close();
		//driver.quit();
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
