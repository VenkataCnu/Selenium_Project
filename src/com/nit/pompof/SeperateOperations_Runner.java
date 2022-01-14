package com.nit.pompof;

import org.openqa.selenium.WebDriver;

import com.cognizent.org.Example_2;
import com.nit.pagelocators.SeperateOperations;

public class SeperateOperations_Runner {

	public static void main(String[] args) {

	WebDriver driver = Example_2.getDriver("Chrome");
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	
	SeperateOperations so = new SeperateOperations(driver);
	
	so.enterUsername("Admin");
	so.enterPassword("admin123");
	so.enterLogin();
	so.enterPim();
	so.enterAddEmp();
	so.enterFirstname("Subhash");
	so.entermiddleName("Chandhra");
	so.enterLastname("Bose");
	so.enterSave();
	
	
	
	}

}
