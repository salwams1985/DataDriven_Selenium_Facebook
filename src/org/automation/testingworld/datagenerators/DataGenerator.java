package org.automation.testingworld.datagenerators;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {
	//getting data from login sheet at excel test data workbook,for Login
	@DataProvider(name="Excel")
	public static Object[][] testDataGenerator() throws Exception
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
	
	//getting data from register sheet at excel test data workbook , for SignUp
	@DataProvider(name="Register")
	public static Object[][] testDataGeneratorRegister() throws Exception
	{
		FileInputStream file = new FileInputStream("./TestData/FacebookTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet loginSheet = workbook.getSheet("Register");
		int numberOfData = loginSheet.getPhysicalNumberOfRows();		
		Object [][] testData = new Object [numberOfData][3];
		
		for (int i = 0; i < numberOfData; i++) {
			XSSFRow row = loginSheet.getRow(i);
			XSSFCell firstName =  row.getCell(0);
			XSSFCell lastName =  row.getCell(1);
			XSSFCell phoneNumber =  row.getCell(2);
			//filling data at array
			testData[i][0] = firstName.getStringCellValue();
			testData[i][1] = lastName.getStringCellValue();	
			testData[i][2] = phoneNumber.getStringCellValue();	
		}
		return testData;
		
	}

}
