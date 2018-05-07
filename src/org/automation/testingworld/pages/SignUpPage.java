package org.automation.testingworld.pages;

import org.automation.testingworld.utliity.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//POM page object module
public class SignUpPage {
	///will contain methods for each activity in the page	
	WebDriver driver;
	
	public SignUpPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
    public void enterFirstName (String firstName) throws Exception{
    	driver.findElement(By.name(Utility.fetchLocatorValue("login_firstname_name"))).sendKeys(firstName);
	}
    
    public void enterLastName (String lastName) throws Exception{
    	driver.findElement(By.name(Utility.fetchLocatorValue("login_lastname_name"))).sendKeys(lastName);
	}
    
    public void enterMobileNumber (String mobileNumber) throws Exception{
    	driver.findElement(By.xpath(Utility.fetchLocatorValue("login_mobilenumber_xpath"))).sendKeys(mobileNumber);
	}
    

}
