package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Puma_Running2 extends Base_Page 
{
	@FindBy(xpath="(//ul[@class='products-grid products-grid--max-4-col first last odd']//li[3]//a)[3]")
	private WebElement selectshoe;
	
	
	public Puma_Running2(WebDriver driver)
	{
		super(driver);
		
	}
	public void clickProduct()
	{
		clickAction(selectshoe);
	}

}
