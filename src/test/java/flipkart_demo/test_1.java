package flipkart_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_1 {
	public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","C://Bootcamp//chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get(" https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.close();

}}
