package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Puma_Home extends Base_Page
{
	@FindBy(xpath="(//a[@class='digimeg-nav-item'])[1]")
	private WebElement men;
	
	public Puma_Home(WebDriver driver) 
	{
		super(driver);
	}
	public void mouseAction(WebDriver driver,WebElement ele)
	{
		MouseHoverAction(driver, ele);
	}
	
	@FindBy(xpath="(//a[.='Running'])[6]")
	private WebElement running;
	
	public void clickRunning()
	{
		clickAction(running);
	}
	
}
