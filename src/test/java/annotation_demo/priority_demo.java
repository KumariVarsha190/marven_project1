package annotation_demo;

import org.testng.annotations.Test;

public class priority_demo {
	@Test(priority=2)  
	public void test1()  
	{  
	System.out.println("This is test1");  
	}  
	@Test(priority=1)  
	public void test2()  
	{  
	System.out.print("This is test2");  
	}  

}
