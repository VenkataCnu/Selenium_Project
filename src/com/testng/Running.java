package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cognizent.org.Example_2;

public class Running {

	WebDriver driver;

	@Parameters({ "User", "Password" })
	@Test
	public void Login(String uName, String password) {

		driver.findElement(By.id("txtUsername")).sendKeys(uName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

	@Parameters({ "FirstName", "LastName" })
	@Test(priority = 1)
	public void AddEmployee(String fName, String lName) {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.id("btnSave")).click();
	}

	@Parameters({ "Browser", "URL" })
	@BeforeClass
	public void OpenApplication(String brName, String url) {
		this.driver = Example_2.getDriver(brName);
		driver.get(url);
		driver.manage().window().maximize();
	}

	/*
	 * @AfterClass public void closeApplication() { driver.quit(); }
	 */
}
