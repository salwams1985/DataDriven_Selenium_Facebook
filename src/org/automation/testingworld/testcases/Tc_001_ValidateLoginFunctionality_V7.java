package org.automation.testingworld.testcases;

import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.Test;

public class Tc_001_ValidateLoginFunctionality_V7 extends DriverInstance {
	///video part7
	@Test
	public void tc_001_login_functionality() throws Exception {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("Uname1");
		login.enterPassword("pass1");
		login.clickSignin();
	}
}
