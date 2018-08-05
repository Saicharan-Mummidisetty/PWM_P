package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Flipkart_Home2 extends Base_Page
{

	public Flipkart_Home2(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn;
		
	public void searchproduct(String productname)
	{
		PassData(searchBox, productname);
	}
	
	public void searchaction()
	{
		clickAction(searchbtn);
	}
	
	

}
