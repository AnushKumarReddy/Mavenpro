package TestNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	WebDriver driver;
	@BeforeMethod
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test(dataProvider = "data")
	public void login(String username,String pwd)
	{
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();
		String title = driver.getTitle();
		if(title.equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
@DataProvider(name="data")
public Object[][] testData()
{
	Object[][]obj=new Object[3][2];
	obj[0][0]="mngr310906";
	obj[0][1]="AbypEdeeee";
	obj[1][0]="mngr310906";
	obj[1][1]="AbypEde";
	obj[2][0]="mngr3109062";
	obj[2][1]="AbypEderts";
	return obj;
}
}
