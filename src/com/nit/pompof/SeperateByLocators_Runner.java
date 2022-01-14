package com.nit.pompof;

import org.openqa.selenium.WebDriver;

import com.cognizent.org.Example_2;
import com.nit.pagelocators.SeperateByLocators;

public class SeperateByLocators_Runner extends SeperateByLocators {

	public static void main(String[] args) {
		WebDriver driver = Example_2.getDriver("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

		driver.findElement(userNameLocator).sendKeys("Admin");
		driver.findElement(passwordLocator).sendKeys("admin123");
		driver.findElement(loginLocator).click();
		driver.findElement(pimLocator).click();
		driver.findElement(AddEmpLocator).click();
		driver.findElement(firstNameLocator).sendKeys("Subhash");
		driver.findElement(middleNameLocator).sendKeys("chandhra");
		driver.findElement(lastNameLocator).sendKeys("Bose");
		driver.findElement(saveLocator).click();

	}

}
