package annotation_demo;

import org.testng.annotations.Test;

public class depend_method {
	 @Test
	    public void parentTest() { 
	      System.out.println("Running parent test.");
	    }
	   
	    @Test(dependsOnMethods={"parentTest"}) 
	    public void dependentTest() { 
	      System.out.println("Running dependent test.");
	    } 
	}


