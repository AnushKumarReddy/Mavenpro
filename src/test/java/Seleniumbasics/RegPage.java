package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegPage {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.findElement(By.linkText("REGISTER")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("firstName")).sendKeys("Chandra");
	Thread.sleep(3000);
	driver.findElement(By.name("lastName")).sendKeys("anush");
	Thread.sleep(3000);
	driver.findElement(By.name("country")).sendKeys("INDIA");
}

}
