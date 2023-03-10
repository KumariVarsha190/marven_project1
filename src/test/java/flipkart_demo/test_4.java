package flipkart_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_4 {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C://Bootcamp//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com//");
		driver.manage().window().maximize();
		
		System.out.println(driver.getPageSource());
		driver.close();
		
		

}}
