package annotation_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class test2 {
	@BeforeClass
	void login()
	{
		System.out.println("Login ...");
	}
	@Test(priority=1)
	void Search()
	{
		System.out.println("Search ...");
		
	}
	@Test(priority=2)
	void AdvanceSearch()
	{
		System.out.println("Advance search");
	}
	@AfterClass
	void close()
	{
		System.out.println("close");
	}

}
