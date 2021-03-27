package Js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptConcepts {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.yahoo.com/");
	WebElement uid = driver.findElement(By.name("username"));
	WebElement check = driver.findElement(By.xpath("//label[@for='persistent']"));
	//check.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='anush'", uid);
	js.executeScript("arguments[0].click()", check);
	js.executeScript("scrollBy(0,600)");
	
}
}
