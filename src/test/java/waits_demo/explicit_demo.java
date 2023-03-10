package waits_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_demo {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement username =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		username.sendKeys("Admin");

}}
