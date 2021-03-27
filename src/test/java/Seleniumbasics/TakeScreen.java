package Seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreen {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/V1/index.php");
	driver.findElement(By.name("uid")).sendKeys("mngr310906");
	driver.findElement(By.name("password")).sendKeys("AbypEde");
	driver.findElement(By.name("btnLogin")).click();
	String title = driver.getTitle();
	//System.out.println(title);
	if(title.equals("GTPL Bank Manager HomePage"))
	{
		System.out.println("home page opened you are ready to go");
	}
	else
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination="./screenshots/tss.png";
		File target=new File(destination);
		FileUtils.copyFile(source, target);
		
	}
}
}
