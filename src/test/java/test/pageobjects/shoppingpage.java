package test.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shoppingpage {

	WebDriver driver;
	
	public shoppingpage(WebDriver driver) {
		this.driver=driver;
	}

	By storelink=By.className("primary-nav-link");
	By deliverytody=By.xpath("//*[text()='DELIVERY TODAY']");
	By storebutton=By.xpath("//button[@class='rmq-cb9cc2fa rmq-b5beda40 rmq-92e48e80']");
	public WebElement getstorelink()
	{
		return driver.findElement(storelink);
	}
	
	public List<WebElement> getdelivertoday()
	{
		return driver.findElements(deliverytody);
	}
	public List<WebElement> getstorebutton()
	{
		return driver.findElements(storebutton);
	}
}
