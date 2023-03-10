package annotation_demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class grouping_demo {
	@Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("this is login by facebook");
	}
	@Test(priority=3,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("this is login by Twitter");
	}
	@Test(priority=4,groups= {"sanity","regression"})
	void signupByEmail()
	{
		System.out.println("this is sign up by email");
	}
	@Test(priority=5,groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("this is sign up facebook");
	}
	@Test(priority=6,groups= {"regression"})
	void signupbyTwiter()
	{
		System.out.println("this is sign up Twitter");
	}
	@Test(priority=7,groups= {"sanity","regression"})
	void Paymentinrupee()
	{
		System.out.println("this is paymnet in rupee");
	}
	
	
	
	
	
	

}
