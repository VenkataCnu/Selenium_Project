package com.nit.pompof;

import com.nit.pagelocators.Integration_Class;

public class IntegrationClass_Runner extends Integration_Class {

	public static void main(String[] args) {
		OpenApplication("chrome", "https://opensource-demo.orangehrmlive.com");

		// Login Page
		Page_Login.enterUsername("Admin");
		Page_Login.enterPassword("admin123");
		Page_Login.enterLogin();
		
		// Home Page
		Page_Home.enterPim();
		Page_Home.enterAddEmp();
		
		// Add Emp Page
		Page_AddEmp.enterFirstname("Konidhela");
		Page_AddEmp.entermiddleName("Pawan");
		Page_AddEmp.enterLastname("Kalyan");
		Page_AddEmp.enterSave();
		
	}

}
