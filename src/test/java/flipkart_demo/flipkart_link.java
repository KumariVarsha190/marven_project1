package flipkart_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class flipkart_link {
	
	ChromeDriver driver;
	String url = "http://www.flipkart.com";

	@BeforeClass
	
	
	public void invokeBrowser(){
		
		
		System.setProperty("Webdriver.chrome.driver","C://Bootcamp//chromedriver");
		
		// \n \t -- escape character
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.get(url);
		
	}
	@Test(priority=1)
	public void getLinkCount(){
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links on a page :: "+allLink.size());
	}
	@Test(priority=2)
	public void getLinkUrl(){
		String url = driver.findElement(By.linkText("Amazon Pay")).getAttribute("href");
		
		System.out.println("Url :: "+ url);
	}
	@AfterClass
	public void getAllLinkInfo(){
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLink){
			System.out.println("Link Text :: "+ link.getText());
			System.out.println("Link URL  :: "+ link.getAttribute("href"));
			
			System.out.println("-------------------------------------------");
		}
	}

}


