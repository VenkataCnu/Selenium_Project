package com.nit.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ohrm_Pof_Homepage {

	@FindBy(linkText = "PIM")
	private static WebElement Pim;

	@FindBy(partialLinkText = "Add Emp")
	private static WebElement AddEmp;

	public void linkPim() {
		Pim.click();
	}

	public void linkAddEmp() {
		AddEmp.click();
	}
}
