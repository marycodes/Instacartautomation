package test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
 protected WebDriver driver;
	private String emailerror="An account already exists with this email.";
 public homepage(WebDriver driver)
 {
	 this.driver=driver;
 }
 
 By zipcodebox=By.xpath("//*[@id='address_line_1']");
 By signupemail=By.xpath("//input[@id='nextgen-authenticate.all.sign_up_email']");
 By signupemailbtn=By.xpath("//*[text()='Sign up with email']");
 By emailerrortext=By.xpath("//*[text()='An account already exists with this email.']");
 By Login=By.xpath("//*[text()='Log in']");
 By loginemail=By.id("nextgen-authenticate.all.log_in_email");
 By loginpassword=By.id("nextgen-authenticate.all.log_in_password");
 By loginbtn=By.xpath("//button[@type='submit']");
 public WebElement getzipcodebox()
 {
	 return driver.findElement(zipcodebox);
 }


public WebElement getsignupemail()
{
	 return driver.findElement(signupemail);
}


public WebElement signupemailbtn()
{
	 return driver.findElement(signupemailbtn);
}

public WebElement getemailerrortext()
{
	 return driver.findElement(emailerrortext);
}

public WebElement getLogin()
{
	 return driver.findElement(Login);
}

public WebElement getLoginemail()
{
	 return driver.findElement(loginemail);
}
public WebElement getLoginpassword()
{
	 return driver.findElement(loginpassword);
}

public WebElement getLoginsubmit()
{
	 return driver.findElement(loginbtn);
}
}