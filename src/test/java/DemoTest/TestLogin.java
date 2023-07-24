package DemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobject.Loginpom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {

	@Test
public void test() {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Loginpom login =PageFactory.initElements(driver, Loginpom.class);
	login.getTxt_login().sendKeys("Abic@gmail.com");
	login.getTxt_pass().sendKeys("1234");
	login.getBtn_login().click();
}
}
