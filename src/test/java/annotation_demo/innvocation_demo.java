package annotation_demo;

import org.testng.annotations.Test;

public class innvocation_demo {
	@Test(invocationCount=10)
	void test()
	{
		System.out.println("testing");
	}

}
