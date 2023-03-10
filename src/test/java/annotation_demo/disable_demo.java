package annotation_demo;

import org.testng.annotations.Test;

public class disable_demo {
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("This is test case 1");
	}
	@Test
	public void test2()
	{
		System.out.println("This is test case 2");
	}
	

}
