package org.automation.testingworld.datagenerators;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator_V12 {
	//* Same DataProvider will be used for different test cases
	
	@DataProvider(name="ExcelX")
	public static Object[][] testDataGenerator(Method met) throws Exception
	{
		if (met.getName().equalsIgnoreCase("tc_001_login_functionality")) 
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
		else if (met.getName().equalsIgnoreCase("tc_002_register_new_User")) 
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
		else 
		{
			Object [][] testData = new Object [2][3];
			return testData;
		}
	}

}