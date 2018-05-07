package org.automation.testingworld.testcases;

import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.datagenerators.DataGenerator_V12;
import org.automation.testingworld.pages.SignUpPage;
import org.testng.annotations.Test;

public class TC_002_Register_new_User extends DriverInstance {
	@Test(dataProvider="ExcelX" , dataProviderClass=DataGenerator_V12.class)
	public void tc_002_register_new_User(String fname, String lname , String pnumber) throws Exception
	{
		SignUpPage signup= new SignUpPage(driver);
		signup.enterFirstName(fname);
		signup.enterLastName(lname);
		signup.enterMobileNumber(pnumber);
	}

}
