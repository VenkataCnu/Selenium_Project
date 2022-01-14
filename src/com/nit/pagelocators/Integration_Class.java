package com.nit.pagelocators;

import org.openqa.selenium.WebDriver;

import com.cognizent.org.Example_1;

public class Integration_Class {

	public static Ohrm_Login_Page Page_Login;
	public static Ohrm_Home_Page Page_Home;
	public static Ohrm_AddEmp_Page Page_AddEmp;

	public static void OpenApplication(String brName, String appUrl) {
		WebDriver driver = Example_1.getDriver(brName);
		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	public void pageLocators() {
		Page_Login = new Ohrm_Login_Page();
		Page_Home = new Ohrm_Home_Page();
		Page_AddEmp = new Ohrm_AddEmp_Page();
	}
}