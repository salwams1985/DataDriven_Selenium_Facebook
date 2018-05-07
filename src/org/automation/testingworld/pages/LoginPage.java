package org.automation.testingworld.pages;

import org.automation.testingworld.utliity.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//POM page object module
public class LoginPage {
	///will contain methods for each activity in the page	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void enterUsername(String uname) throws Exception{
		//driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id(Utility.fetchLocatorValue("login_username_id"))).sendKeys(uname);
	}
	
    public void enterPassword (String pass) throws Exception{
    	driver.findElement(By.id(Utility.fetchLocatorValue("login_password_id"))).sendKeys(pass);
	}
    
    public void clickSignin() throws Exception
    {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_signin_xpath"))).click();
	}

}
