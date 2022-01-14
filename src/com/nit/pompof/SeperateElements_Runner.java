package com.nit.pompof;

import org.openqa.selenium.WebDriver;

import com.cognizent.org.Example_2;
import com.nit.pagelocators.SeperateElements;

public class SeperateElements_Runner {

	public static void main(String[] args) {

		WebDriver driver = Example_2.getDriver("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		SeperateElements se = new SeperateElements(driver);
		se.get_Username().sendKeys("Admin");
		se.get_Password().sendKeys("admin123");
		se.get_Login().click();
		se.get_Pim().click();
		se.get_Addemp().click();
		se.get_Firstname().sendKeys("Subhash");
		se.get_Middlename().sendKeys("Chandhra");
		se.get_Lastname().sendKeys("Bose");
		se.get_Save().click();
	}

}
