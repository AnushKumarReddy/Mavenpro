package TestNg2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void fbLogin()
	{
		System.out.println("Face book login TEst");
		Assert.assertEquals("Anush","Anush");
	}
	@Test
	public void bankLogin()
	{
		System.out.println("Bank page login Test");
		Assert.assertEquals("Anush", "Reddy");
	}
	@Test(dependsOnMethods ="bankLogin" )
	public void gmailLogin()
	{
		System.out.println("Bank page login Test");
		Assert.assertEquals("Anush", "Anush");
}
}