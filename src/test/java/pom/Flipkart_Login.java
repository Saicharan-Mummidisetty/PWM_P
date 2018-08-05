package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Flipkart_Login extends Base_Page
{

	public Flipkart_Login(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginbtn;
	
	public void setUserName(String un)
	{
		PassData(username, un);
	}
	
	public void setPassword(String pwd)
	{
		PassData(password, pwd);
	}
	
	public void clickLogin()
	{
		clickAction(loginbtn);
	}
	
}
