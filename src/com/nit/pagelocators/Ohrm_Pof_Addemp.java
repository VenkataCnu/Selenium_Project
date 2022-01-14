package com.nit.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ohrm_Pof_Addemp {

	@FindBy(id = "firstName")
	private static WebElement getFirstName;

	@FindBy(id = "middleName")
	private static WebElement getMiddleName;

	@FindBy(id = "lastName")
	private static WebElement getLastName;

	@FindBy(id = "btnSave")
	private static WebElement getSave;

	public void enterFirstname(String fname) {
		getFirstName.sendKeys(fname);
	}

	public void entermiddleName(String mname) {
		getMiddleName.sendKeys(mname);
	}

	public void enterLastname(String lname) {
		getLastName.sendKeys(lname);
	}

	public void enterSave() {
		getSave.click();
	}

}
