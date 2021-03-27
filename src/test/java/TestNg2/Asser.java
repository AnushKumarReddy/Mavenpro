package TestNg2;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asser {
	SoftAssert sa=new SoftAssert();
@Test
	public void A1()
	{
		System.out.println("line1");
		System.out.println("line2");
		Assert.assertEquals("Anush","Anush");
		
		System.out.println("line3");
		sa.assertEquals("Anush", "Anus");
		System.out.println("line4");
		System.out.println("line5");
		System.out.println("line6");
		sa.assertAll();
	}

}
