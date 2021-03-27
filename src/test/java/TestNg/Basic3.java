package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basic3 {
	@BeforeMethod
	public void bM()
	{
		System.out.println("method is gng to start");
	}
	@AfterMethod
	public void aM()
	{
		System.out.println("Methos is ended");
	}
		@Test
		public void m7()
		{
			System.out.println("This is method 7");
			
		}
		@Test()
		public void m8()
		{
			System.out.println("This is method 2");
		}

}
