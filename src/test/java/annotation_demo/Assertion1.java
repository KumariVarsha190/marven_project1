package annotation_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Assertion1 {
	public void abc() {
		int a=10;
		int b=15;
	
		
				
//		if(a>b) {
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}
			
		//Assert.assertEquals(a, b);
		//Assert.assertTrue(true);
		Assert.assertEquals(a<b, true,"a is not greater than b");
	}
	public void abc1() {
		String a1="varsha";
		String b1="varsha";
		Assert.assertNotEquals(a1, b1);
	}

}
