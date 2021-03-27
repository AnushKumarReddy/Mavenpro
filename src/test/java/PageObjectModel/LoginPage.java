package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	//declarartion
	@FindBy(name="uid")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="btnLogin")
	WebElement login;
	
	//initialization
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//utiliztion
	
	public void getUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void getPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void getLogin()
	{
		login.click();
	}

}
