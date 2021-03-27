package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/anush/Desktop/months.html");
	WebElement element = driver.findElement(By.id("Month"));
	Select s=new Select(element);
	s.selectByIndex(4);
	Thread.sleep(3000);
	s.selectByValue("7");
	Thread.sleep(3000);
	s.selectByVisibleText("Fibra");
	Thread.sleep(3000);
	s.deselectByVisibleText("April");
	Thread.sleep(3000);
	s.deselectAll();
}
}
