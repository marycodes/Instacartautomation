package test.resource;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public WebDriver driver;
	

	public WebDriver initialiseDriver() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\java\\test\\resource\\chromedriver.exe");
		//System.out.println(System.getProperty("user.dir")+"\\src\\test\\java\\test.resource\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("http://instacart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	//System.setproperty="chrome.webdriver.driver","{user_dir}"

	
}
