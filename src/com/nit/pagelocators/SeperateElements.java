package com.nit.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeperateElements {

	WebDriver driver;

	public SeperateElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement get_Username() {
		return driver.findElement(By.id("txtUsername"));
	}

	public WebElement get_Password() {
		return driver.findElement(By.id("txtPassword"));
	}

	public WebElement get_Login() {
		return driver.findElement(By.id("btnLogin"));
	}

	public WebElement get_Pim() {
		return driver.findElement(By.linkText("PIM"));
	}

	public WebElement get_Addemp() {
		return driver.findElement(By.linkText("Add Employee"));
	}

	public WebElement get_Firstname() {
		return driver.findElement(By.id("firstName"));
	}

	public WebElement get_Middlename() {
		return driver.findElement(By.id("middleName"));
	}

	public WebElement get_Lastname() {
		return driver.findElement(By.id("lastName"));
	}

	public WebElement get_Save() {
		return driver.findElement(By.id("btnSave"));
	}

}
