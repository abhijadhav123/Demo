package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firsttest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().refresh();
		driver.close();
	}

}
