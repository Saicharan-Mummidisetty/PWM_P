package pom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Flipkart_Product3 extends Base_Page
{

	public Flipkart_Product3(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//ul/li/button")
	private WebElement addToCartbtn;
		
	public void verifyProductPage(String productpage_title)
	{
		verifyTitle(productpage_title);
	}
	
	public void addProduct()
	{
		clickAction(addToCartbtn);
	}
	
	
	public void switchTab()
	{
		String parent_id=driver.getWindowHandle();
		Set<String> allwh=driver.getWindowHandles();
		allwh.remove(parent_id);
		for(String wh : allwh)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
	}
	
}
