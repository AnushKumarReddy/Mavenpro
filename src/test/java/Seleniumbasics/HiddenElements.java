package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
List<WebElement> elements = driver.findElements(By.id("male"));
/*for(WebElement ele:elements)
{
	int x = ele.getLocation().getX();
	if(x!=0)
	{
		ele.click();
	}
}*/
int size = elements.size();
for(int i=0;i<size;i++)
{
	WebElement ele = elements.get(i);
	int x = ele.getLocation().getX();
	if(x!=0)
	{
		ele.click();
	}
}
}
}