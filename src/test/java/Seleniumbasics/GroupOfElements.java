package Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupOfElements {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.findElement(By.linkText("REGISTER")).click();
	Thread.sleep(3000);
	List<WebElement> chandra= driver.findElements(By.name("country"));
       int size = chandra.size();
       for(int i=0;i<size;i++)
       {
    	   WebElement couName = chandra.get(i);
    	  String text = couName.getText();
    	  System.out.println(text);
    	  if(text.equalsIgnoreCase("india"))
    		  couName.click();
    	 
       }


}
	
}