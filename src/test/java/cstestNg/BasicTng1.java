package cstestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTng1 {
@Test(groups = "chandrateam")
public void m1()
{
	System.out.println("This is method 1");
}
@Test(groups = "rajteam")
public void m2()
{
	System.out.println("This is method 2");
}
@Test
public void m3() 
{
	System.out.println("This is method 3");
}
}
