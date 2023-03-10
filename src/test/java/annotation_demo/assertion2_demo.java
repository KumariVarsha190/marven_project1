package annotation_demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion2_demo {
	@Test
	void hardassertion()
	
	{
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		
		Assert.assertEquals(1,1);
		System.out.println("Hard assertion done");
		
		
	}
	@Test
	void test_softassertion()
	{
		System.out.println("testing");
		System.out.println("testing");
		System.out.println("testing");
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(1,2);
		System.out.println("soft assertion completed");
		sa.assertEquals(1, 1);
		sa.assertAll();//mandatory
	}

}
