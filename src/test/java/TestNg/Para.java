package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {
	@Parameters({"browser","username","password"})
	@Test
	public void login(String pageurl,String uid,String pwd)
	{
		System.out.println("page name is :"+pageurl);
		System.out.println("user name is :"+uid);
		System.out.println("password is :"+pwd);

}
}