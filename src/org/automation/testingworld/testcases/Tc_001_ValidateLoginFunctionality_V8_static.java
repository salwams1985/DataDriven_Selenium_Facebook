package org.automation.testingworld.testcases;

import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc_001_ValidateLoginFunctionality_V8_static extends DriverInstance{

	@Test(dataProvider="Static")
	public void tc_001_login_functionality(String uname, String pass) throws Exception {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickSignin();
	}

	///* using here data that generated at @DataProvider , every time one row will coming to this method
	///reading static test data
	@DataProvider(name="Static")
	public Object[][] testtDataGenerator()
	{
		// object [][] 2d array means: define row then column , that will pass data
		Object [][] data = {{"Uname1","Pass1"},{"Uname2","Pass2"},{"Uname3","Pass3"}};
		return data;
	}

}
