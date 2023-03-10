package waits_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class impilict_demo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://goo.gl/RVdKM9");
		String text =driver.findElement(By.xpath("//a[contains(text(),'MacBook')]")).getText();
		System.out.println(text);
		String actualTitle ="MacBook";
		
		if(actualTitle.equals(text)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		//driver.close();
	}

}

