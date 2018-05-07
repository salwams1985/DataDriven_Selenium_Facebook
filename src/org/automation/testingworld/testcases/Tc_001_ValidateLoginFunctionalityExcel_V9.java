package org.automation.testingworld.testcases;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc_001_ValidateLoginFunctionalityExcel_V9 extends DriverInstance {
	///this method used for running test that takes data from excel file"Data Driven Framework"
	@Test(dataProvider="Static")
	public void tc_001_login_functionality(String uname, String pass) throws Exception {
		LoginPage login = new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickSignin();
	}
	
	///Usage: gets data from excel sheet and loop it, for multiple execution of same test case
	@DataProvider(name="Static")
	public Object[][] testtDataGenerator() throws Exception
	{
		FileInputStream file = new FileInputStream("./TestData/FacebookTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet loginSheet = workbook.getSheet("Login");
		int numberOfData = loginSheet.getPhysicalNumberOfRows();		
		Object [][] testData = new Object [numberOfData][2];
		
		for (int i = 0; i < numberOfData; i++) {
			XSSFRow row = loginSheet.getRow(i);
			XSSFCell username =  row.getCell(0);
			XSSFCell password =  row.getCell(1);
			testData[i][0] = username.getStringCellValue();
			testData[i][1] = password.getStringCellValue();			
		}
		return testData;
	}

}
