package cstestNg;

import org.testng.annotations.Test;

public class BasicTng2 {
	@Test()
	public void m4()
	{
		System.out.println("This is method 4");
	}
	@Test
	public void m5()
	{
		System.out.println("This is method 5");
	}
	@Test(groups = "chandrateam")
	public void m6() 
	{
		System.out.println("This is method 6");
	}

}
