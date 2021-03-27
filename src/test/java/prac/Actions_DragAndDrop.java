package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragAndDrop {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
	WebElement sou = driver.findElement(By.id("draggable"));
	WebElement tar = driver.findElement(By.id("droppable"));
	Actions a=new Actions(driver);
//a.dragAndDrop(sou, tar).build().perform();
	a.clickAndHold(sou)
	.moveToElement(tar)
	.release().build().perform();
}
}
