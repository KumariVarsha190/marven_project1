package pom_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	public WebDriver driver;
	login_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//Webelemt locator+identification
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement img_logo;
	@FindBy(name="username")
	WebElement txt_username;
	@FindBy(css="input[placeholder='Password']")
	WebElement txt_password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement txt_submit;
	//Action method
	public void setUserName(String username)
	{
		
	}
	


}
