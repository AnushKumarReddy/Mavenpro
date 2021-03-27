package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions a=new Actions(driver);
	a.contextClick(element).build().perform();
	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	driver.switchTo().alert().dismiss();
}
}
