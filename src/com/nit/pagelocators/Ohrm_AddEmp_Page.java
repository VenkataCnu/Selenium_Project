package com.nit.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ohrm_AddEmp_Page {
	WebDriver driver;

	private WebElement get_Firstname() {
		return driver.findElement(By.id("firstName"));
	}

	private WebElement get_Middlename() {
		return driver.findElement(By.id("middleName"));
	}

	private WebElement get_Lastname() {
		return driver.findElement(By.id("lastName"));
	}

	private WebElement get_Save() {
		return driver.findElement(By.id("btnSave"));
	}

	public void enterFirstname(String fname) {
		get_Firstname().sendKeys("Subhash");
	}

	public void entermiddleName(String mname) {
		get_Middlename().sendKeys("Chandhra");
	}

	public void enterLastname(String lname) {
		get_Lastname().sendKeys("Bose");
	}

	public void enterSave() {
		get_Save().click();
	}

}
