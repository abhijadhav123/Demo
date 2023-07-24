package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/aurangabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Movies']")).click();
		//driver.findElement(By.xpath("//div[@class='sc-7o7nez-0 enhvog'][normalize-space()='Marathi']")).click();
	}

}
