package com.cognizent.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Example_3 {
	public static void main(String[] args) {
		WebDriver driver = Example_2.getDriver("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		if (driver.findElement(By.id("welcome")).isDisplayed())

			System.out.println("you are Succesfully Logged in");
		else

			System.out.println("Please Enter the details");

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Subhash chandhra");
		driver.findElement(By.id("lastName")).sendKeys("Bose");
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.id("personal_optGender_1")).click();

		Select dd_Nationality = new Select(driver.findElement(By.id("personal_cmbNation")));
		dd_Nationality.selectByVisibleText("Indian");
		driver.findElement(By.id("btnSave")).click();

		List<WebElement> nationality_Options = dd_Nationality.getOptions();

		for (WebElement options : nationality_Options) {
			System.out.println("Total No.of Options are: " + options);

		}

		driver.findElement(By.linkText("PIM")).click();

		List<WebElement> trows = driver.findElement(By.id("resultTable")).findElements(By.tagName("tr"));
		@SuppressWarnings("unused")
		List<WebElement> tclos = trows.get(1).findElements(By.tagName("td"));
		int noOfRows = trows.size();

		for (int row = 1; row < noOfRows; row++) {
			List<WebElement> colm = trows.get(row).findElements(By.tagName("td"));

			for (@SuppressWarnings("unused") WebElement details : colm) {
				System.out.println(colm);
			}

		}
		driver.close();
	}

}
