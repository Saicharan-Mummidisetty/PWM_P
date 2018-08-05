package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Flipkart_cart4 extends Base_Page
{

	public Flipkart_cart4(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[.='Remove']")
	private WebElement remove;
	
	@FindBy(xpath="(//div[@class='_1ys9uX _17ccT5']//div)[1]")
	private WebElement msg;
	
	
	
	public void remove()
	{
		clickAction(remove);
	}
	
	public void verifymsg(String msg1)
	{
		String text = msg.getText();
		if(text.contains(msg1))
		{
			System.out.println("product has been removed");
		}
		else
		{
			System.out.println("product has been not removed");
		}
	}
	


}
