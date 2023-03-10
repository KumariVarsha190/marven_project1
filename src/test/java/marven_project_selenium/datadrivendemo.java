package marven_project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datadrivendemo {
	public static void main(String[] args) throws Exception{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		String file=System.getProperty("user.dir")+"\\test_data\\data2.xlsx";
		int rows =xutil.getRoWCount(file,"sheet1");
		for(int i=1;i<=rows;i++) {
			String princ =xutil.getCellData(file,"sheet1",i,0);
			String rateofinterest =xutil.getCellData(file,"sheet1",i,1);
			String per1 =xutil.getCellData(file,"sheet1",i,2);
			String per2=xutil.getCellData(file,"sheet1",i,3);
			String fre=xutil.getCellData(file,"sheet1",i,4);
			String exp_mvalue=xutil.getCellData(file,"sheet1",i,5);
			driver.findElement(By.id("Principal")).sendKeys(princ);
			driver.findElement(By.id("interest")).sendKeys(rateofinterest);
			driver.findElement(By.id("tenure")).sendKeys(per1);
			Select perdrp =new Select(driver.findElement(By.id("tenureperiod")));
			perdrp.selectByVisibleText(per2);
			Select fredrp =new Select(driver.findElement(By.id("frequency")));
			perdrp.selectByVisibleText(fre);
			JavascriptExecutor js =(JavascriptExecutor)driver;
			WebElement calculate_btn=driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
			js.executeScript("argument[0].click();", calculate_btn);
			String act_mvalue=driver.findElement(By.id("resp_matval")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("test passed");
				xutil.setcellData(file,"sheet1",i,7,"passed");
				
			}
			else{
				System.out.println("test failed");
				xutil.setcellData(file,"Sheet1",i,7,"failed");
				
			}
			Thread.sleep(3000);
			
			WebElement clear_btn=driver.findElement(By.xpath("//img[@class='PL5']"));
			js.executeScript("arguments[0].click()", clear_btn);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			
		
			
			
			
			
		}
	}
	}

	
