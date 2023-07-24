package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {

	public static void main(String[] args) {
	
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
			driver.manage().window().maximize();
		
			driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("C:\\Users\\admin\\Desktop\\Automation Int Q");
			
			
		
	}

}
