package flipkart_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_5 {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C://Bootcamp//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com//");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String pagesource =driver.getPageSource();
		
		System.out.println(title);
		System.out.println(url);
		System.out.println(pagesource);
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		if(url.equals("https://www.flipkart.com//")) {
			System.out.println("Test passed");
			
			
		}
		else {
			System.out.println("Test fail");
			
		}
		if(pagesource.contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!")) {
			System.out.println("Test pass");
			
		}
		else {
			System.out.println("Test fail");
			
		}
		driver.close();
		
		
		
		
}}
