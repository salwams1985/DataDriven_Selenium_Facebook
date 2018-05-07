package org.automation.testingworld.assertions;

import org.openqa.selenium.WebDriver;

//Assertions ;; compares actual result with expected

public class Compare {
	
	public static boolean validatePageURL(WebDriver driver , String expUL) {
		boolean flag = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expUL)) {
			flag = true;
		}
		return flag;
	}
	
	public static boolean validatePageTitle(WebDriver driver , String expTitle) {
		boolean flag = false;
		if (driver.getTitle().equalsIgnoreCase(expTitle)) {
			flag = true;
		}
		return flag;
	}

}
