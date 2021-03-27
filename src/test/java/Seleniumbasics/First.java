package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/anush/Desktop/AnushLoginPage.html");
	driver.findElement(By.id("101")).sendKeys("anush");
	driver.findElement(By.className("c2")).sendKeys("ANush");
	driver.findElement(By.linkText("New user")).click();
}
}
