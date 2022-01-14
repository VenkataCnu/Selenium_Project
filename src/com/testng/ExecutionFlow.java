package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ExecutionFlow {

	@Test
	public void login() {
		System.out.println("This is Login");
		Reporter.log("This is Login", false);
		Assert.assertEquals(true, true);
	}

	@Test(dependsOnMethods = "login")
	public void pim() {
		System.out.println("This is PIM");
		Reporter.log("This is PIM", false);
		Assert.assertEquals(false, true);
	}

	@Test(dependsOnMethods = "pim")
	public void addEmployee() {
		System.out.println("This is Add Employee ");
		Reporter.log("This is addEmployee", false);
		Assert.assertEquals(true, true);
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is @Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is @After class");
	}

}
