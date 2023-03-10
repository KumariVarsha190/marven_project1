package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test_1 {
	WebDriver driver =new ChromeDriver();
	
  @Test(priority=1)
  public void openapp() {
	  driver.get("https://auth.geeksforgeeks.org/");
	  
	  
	  
	  
  }
  @Test(priority=2)
  public void login() {
		driver.findElement(By.id("luser")).sendKeys("ruchika@bebotechnologies.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.className("signin-button")).click();
  }
  @Test(priority=3)
  public void closeapp() {
	  driver.close();
  }
  
  
  
}



