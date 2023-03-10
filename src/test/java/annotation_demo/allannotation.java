package annotation_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allannotation {
	@Test
	@BeforeSuite
	void a() {
		System.out.println("This is before suit");
	}
	@BeforeTest
	void m() {
		System.out.println("This is before class");
	}
	@BeforeClass
	void login()
	{
		System.out.println("This is before class");
	}
	@BeforeMethod
	void me()
	{
		System.out.println("This is before method");
	}
	@AfterMethod
	void Am()
	{
		System.out.println("This is after method");
	}
	@AfterClass
	void Ac()
	{
		System.out.println("This is after class");
	}
	@AfterTest
	void n() {
		System.out.println("This is After test");
	}
	@AfterSuite
	void b() {
		System.out.println("This is after suite");
	}

}
