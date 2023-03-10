package annotation_demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	@BeforeMethod
	void login()
	{
		System.out.println("Login ...");
	}
	@Test(priority=1)
	void Search()
	{
		System.out.println("Search ...");
		
	}
	@AfterMethod
	void logout()
	{
		System.out.println("Logout ...");
	}
	@Test(priority=2)
	void close()
	{
		System.out.println("close");
	}

}
