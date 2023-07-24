package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {

	
	
	@FindBy(how=How.XPATH,using="//input[@id='email']") private WebElement txt_login;
	@FindBy(how=How.XPATH,using="//input[@id='pass']") private WebElement txt_pass;
	@FindBy(how=How.XPATH,using="//button[@name='login']") private WebElement btn_login;
	public WebElement getTxt_login() {
		return txt_login;
	}
	
	
	public WebElement getTxt_pass() {
		return txt_pass;
	}
	
	public WebElement getBtn_login() {
		return btn_login;
	}
	
	
}
