package com.nit.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class Ohrm_Pof_Login {

	@FindBy(how = How.ID_OR_NAME, id = "txtUsername")
	private WebElement txtUname;

	@FindAll({ @FindBy(name = "txtPassword"), @FindBy(id = "txtPassword") })
	private WebElement txtPassword;

	@FindBys({ @FindBy(name = "btnLogin"), @FindBy(xpath = "//div[@id='divLoginButton']") })

	private WebElement buttonLogin;

	public void enterUsername(String uname) {
		txtUname.sendKeys(uname);
	}

	public void enterPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void enterLogin() {
		buttonLogin.click();
	}

}
