package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Puma_Product3 extends Base_Page
{
	@FindBy(xpath="//div[@class='product-size-click-btn']")
	private WebElement size;
	
	@FindBy(id="180~73")
	private WebElement selectsize;
	
	@FindBy(xpath="//button[@title='Add to Cart']")
	private WebElement cartbtn;
	
	public Puma_Product3(WebDriver driver) 
	{
		super(driver);
		
	}
	public void clicksize()
	{
		clickAction(size);
	}
	public void Selectsize()
	{
		clickAction(selectsize);
	}
}
