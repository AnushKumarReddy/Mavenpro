package alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Alerts");
	driver.switchTo().frame("frame3");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame2");
	WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
	Select s=new Select(animals);
	List<WebElement> options = s.getOptions();
	for(WebElement op:options)
	{
		String text = op.getText();
		if(text.equalsIgnoreCase("big baby cat"))
		{
			op.click();
		}
	}
	
	
}
}
