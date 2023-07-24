package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_handle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/delete_customer.php");
		Driver.manage().window().maximize();
		Driver.findElement(By.name("cusid")).sendKeys("12345");
		Driver.findElement(By.name("submit")).click();
		Alert alt=Driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.accept();
	

	}

}

