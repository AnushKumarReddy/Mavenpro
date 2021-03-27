package pageObjectTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;

public class LoginPageTest {
	WebDriver driver;
@Test
public void verifyLogin()
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver.get("http://demo.guru99.com/V1/index.php");
	LoginPage l=new LoginPage(driver);
	l.getUsername("mngr310906");
	l.getPassword("AbypEde");
	l.getLogin();
	
}
}
