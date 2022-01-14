package com.nit.pompof;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cognizent.org.Example_1;
import com.nit.pagelocators.Ohrm_Pof_Addemp;
import com.nit.pagelocators.Ohrm_Pof_Homepage;
import com.nit.pagelocators.Ohrm_Pof_Login;

public class Pof_IntegrationClass {

	public static Ohrm_Pof_Addemp pg_Addemp;
	public static Ohrm_Pof_Homepage pg_Home;
	public static Ohrm_Pof_Login pg_Login;

	public static void OpenApplication(String brName, String appUrl) {
		WebDriver driver = Example_1.getDriver(brName);
		driver.get(appUrl);
		driver.manage().window().maximize();
		pageObjects(driver);
	}
	
	public static void pageObjects(WebDriver driver) {
		pg_Login = new Ohrm_Pof_Login(); 
		PageFactory.initElements(driver, pg_Login);
		
		pg_Home = new Ohrm_Pof_Homepage();
		PageFactory.initElements(driver, pg_Home);
		
		pg_Addemp = new Ohrm_Pof_Addemp();
		PageFactory.initElements(driver, pg_Addemp);
	}
}
