package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Flipkart_PageBtwn21 extends Base_Page
{

	public Flipkart_PageBtwn21(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="((//div[@class='_1UoZlX'])[1]//div[1])[1]")
	private WebElement firstdisplayedproduct;
	
	public void selectproduct()
	{
		clickAction(firstdisplayedproduct);
	}

}
