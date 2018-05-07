package org.automation.testingworld.testcases;

import org.testng.annotations.Test;
import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.datagenerators.DataGenerator_V12;
import org.automation.testingworld.pages.LoginPage;

/* SN: Design data driven structure with Excel
 * place data generator method in separate class and execute test case by that */
public class TC_001_ValidateLoginFunctionality_V10_Externalexcel extends DriverInstance{
	
	@Test(dataProvider="ExcelX" , dataProviderClass=DataGenerator_V12.class)
	public void tc_001_login_functionality(String uname, String pass) throws Exception {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickSignin();
	}
	
}
