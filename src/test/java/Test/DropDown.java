package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel= new Select(drp_country);
		System.out.println(sel.getFirstSelectedOption().getText());
		List<WebElement> list =sel.getOptions();
		for(int i=0;i<list.size();i++) {
			Thread.sleep(2000);
			String value=list.get(i).getText();
			System.out.println(value);
			if (value.equals("BOSNIA AND HERZEGOVINA")) {
				sel.selectByVisibleText("BOSNIA AND HERZEGOVINA");
				break;
			}
			
		}
		
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("ANDORRA");
		Thread.sleep(2000);
		sel.selectByVisibleText("BOSNIA AND HERZEGOVINA");
	}

}


