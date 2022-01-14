package com.nit.pompof;

public class Pof_Integration_Runner_Class extends Pof_IntegrationClass {

	public static void main(String[] args) {
		OpenApplication("chrome", "https://opensource-demo.orangehrmlive.com");

		// Login Page
		pg_Login.enterUsername("Admin");
		pg_Login.enterPassword("admin123");
		pg_Login.enterLogin();

		// Home Page
		pg_Home.linkPim();
		pg_Home.linkAddEmp();

		// Add Emp Page
		pg_Addemp.enterFirstname("Konidhela");
		pg_Addemp.entermiddleName("Pawan");
		pg_Addemp.enterLastname("Kalyan");
		pg_Addemp.enterSave();

	}

}
