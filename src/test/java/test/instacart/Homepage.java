package test.instacart;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import test.pageobjects.homepage;
import test.pageobjects.shoppingpage;
import test.resource.Driver;

public class Homepage extends Driver{

	@Before
public void initialise()
{
	driver=initialiseDriver();
	driver.manage().window().maximize();
	driver.get("http://instacart.com");
}
	@SuppressWarnings("deprecation")
	@Test
	public void enterzipcode()
	{
		homepage obj=new homepage(driver);
		obj.getzipcodebox().sendKeys("08820");
		obj.getzipcodebox().sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER));
		obj.getsignupemail().click();
		obj.getsignupemail().sendKeys("marykavitha1993@gmail.com");
		obj.signupemailbtn().click();
		String errormsg="An account already exists with this email.";
		String actualerror=obj.getemailerrortext().getText();
		//Assert.assertEquals("true", errormsg, actualerror);
	   // Assert.assertFalse(condition);
		obj.getLogin().click();
		obj.getLoginemail().sendKeys("marykavitha1993@gmail.com");
		obj.getLoginpassword().sendKeys("Dennis@99");
		obj.getLoginsubmit().click();
	
	shoppingpage sp=new shoppingpage(driver);
	sp.getstorelink().click();
	System.out.println(sp.getdelivertoday().size());
	System.out.println(sp.getstorebutton().size());
	
	List<WebElement>stores=sp.getstorebutton();
	for(int i=1;i<stores.size();i++)
	{
		System.out.print(stores.get(i).findElement(By.className("rmq-d9beaa7b")).getText());
		System.out.print("-");
		System.out.print(stores.get(i).findElement(By.className("rmq-15bed001")).getText());
		System.out.println("");
		
	}
		/*
	 * @Test
	public void getkeydownzipcode()
	{
		homepage obj=new homepage(driver);
		
	}
	 * 
	 */
	

}
}