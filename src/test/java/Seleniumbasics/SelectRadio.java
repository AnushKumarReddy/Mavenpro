package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectRadio {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	/*List<WebElement> element = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	for(WebElement ele:element)
	{
	String attribute = ele.getAttribute("value");
	System.out.println(attribute);
	if(attribute.equalsIgnoreCase("ruby"))
	{
		ele.click();
	}
	}*/
	WebElement element = driver.findElement(By.xpath("//input[@name='lang' and @type='radio']"));
	Select s=new Select(element);
	List<WebElement> options = s.getOptions();
	for(WebElement op:options)
	{
		String attribute = op.getAttribute("value");
		System.out.println(attribute);
		if(attribute.equalsIgnoreCase("java"))
		{
			op.click();
		}
	}
}

}
