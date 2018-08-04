package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Puma_cart4 extends Base_Page 
{
	@FindBy(xpath="//h2[@class='product-name']")
	private WebElement cartproduct;
	
	public Puma_cart4(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void Verify()
	{
		verifyElement(cartproduct);
	}

}
