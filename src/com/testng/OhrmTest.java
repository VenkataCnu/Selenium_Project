package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cognizent.org.Example_2;

public class OhrmTest {
	WebDriver driver;

	@Parameters({ "User", "Password" })
	@Test
	public void Login(String uname, String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Parameters({ "FirstName", "LastName" })
	@Test(priority = 1)
	public void AddEmployee(String fname, String lname) {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("btnSave")).click();
	}

	@Parameters({ "Browser", "URL" })
	@BeforeClass
	public void openApplication(String brName, String url) {
		this.driver = Example_2.getDriver(brName);
		driver.get(url);
		driver.manage().window().maximize();

	}

}
