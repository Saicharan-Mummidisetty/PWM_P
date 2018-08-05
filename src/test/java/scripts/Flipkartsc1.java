package scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Excel;
import pom.Flipkart_Home2;
import pom.Flipkart_Login;
import pom.Flipkart_PageBtwn21;
import pom.Flipkart_Product3;
import pom.Flipkart_cart4;

public class Flipkartsc1 extends Base_Test
{
	@Test
	public void testsc1()
	{
		String un=Excel.getCellvalue(PATH, "Sc1", 0, 0);
		String pwd=Excel.getCellvalue(PATH, "Sc1", 0, 1);
		Flipkart_Login fp=new Flipkart_Login(driver);
		fp.setUserName(un);
		fp.setPassword(pwd);
		fp.clickLogin();
		Flipkart_Home2 fh=new Flipkart_Home2(driver);
		String sp=Excel.getCellvalue(PATH, "Sc1", 0, 2);
		fh.searchproduct(sp);
		fh.searchaction();
		Flipkart_PageBtwn21 fp1=new Flipkart_PageBtwn21(driver);
		fp1.selectproduct();
		Flipkart_Product3 fp2=new Flipkart_Product3(driver);
		fp2.switchTab();
		String title_Product=Excel.getCellvalue(PATH, "Sc1", 0, 3);
		fp2.verifyProductPage(title_Product);
		fp2.addProduct();
		Flipkart_cart4 fc=new Flipkart_cart4(driver);
		fc.remove();
		String name=Excel.getCellvalue(PATH, "Sc1", 1, 4);
		fc.verifymsg(name);
		
	}
}
