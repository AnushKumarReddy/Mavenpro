package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic1 {
	@Test(groups = "sanity")
	public void m1()
	{
		System.out.println("This is method 1");
		
	}
	@Test()
	public void m2()
	{
		System.out.println("This is method 2");
	}

}
