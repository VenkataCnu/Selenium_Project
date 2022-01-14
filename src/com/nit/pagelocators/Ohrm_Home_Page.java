package com.nit.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ohrm_Home_Page {

	WebDriver driver;

	private WebElement get_Pim() {
		return driver.findElement(By.linkText("PIM"));
	}

	private WebElement get_Addemp() {
		return driver.findElement(By.linkText("Add Employee"));
	}

	public void enterPim() {
		get_Pim().click();
	}

	public void enterAddEmp() {
		get_Addemp().click();
	}

	
	
	
}
