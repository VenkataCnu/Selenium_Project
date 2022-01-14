package com.nit.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ohrm_Login_Page {

	WebDriver driver;

	private WebElement get_Username() {
		return driver.findElement(By.id("txtUsername"));
	}

	private WebElement get_Password() {
		return driver.findElement(By.id("txtPassword"));
	}

	private WebElement get_Login() {
		return driver.findElement(By.id("btnLogin"));
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

}
