package com.nit.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeperateOperations {
	WebDriver driver;

	public SeperateOperations(WebDriver driver) {
		this.driver = driver;
	}

	private WebElement get_Username() {
		return driver.findElement(By.id("txtUsername"));
	}

	private WebElement get_Password() {
		return driver.findElement(By.id("txtPassword"));
	}

	private WebElement get_Login() {
		return driver.findElement(By.id("btnLogin"));
	}

	private WebElement get_Pim() {
		return driver.findElement(By.linkText("PIM"));
	}

	private WebElement get_Addemp() {
		return driver.findElement(By.linkText("Add Employee"));
	}

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

	public void enterUsername(String uname) {
		get_Username().sendKeys("Admin");
	}

	public void enterPassword(String pwd) {
		get_Password().sendKeys("admin123");
	}

	public void enterLogin() {
		get_Login().click();
	}

	public void enterPim() {
		get_Pim().click();
	}

	public void enterAddEmp() {
		get_Addemp().click();
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
