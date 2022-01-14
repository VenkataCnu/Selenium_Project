package com.cognizent.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Table_Concept {

	public static void main(String[] args) {

		WebDriver driver = Example_2.getDriver("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Subhash chandhra");
		driver.findElement(By.id("lastName")).sendKeys("Bose");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_optGender_1")).click();

		Select dd_Nationality = new Select(driver.findElement(By.id("personal_cmbNation")));
		dd_Nationality.selectByVisibleText("Indian");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.linkText("PIM")).click();

		// printing all data
		List<WebElement> trows = driver.findElement(By.id("resultTable")).findElements(By.tagName("tr"));
		System.out.println("No of Rows are " + trows.size());
		int rowsTotal = trows.size();

		List<WebElement> tcol = trows.get(1).findElements(By.tagName("td"));
		System.out.println("No of Columns are " + tcol.size());

		/*
		 * for(WebElement row: trows) 
		 * { 
		 * 		List <WebElement> column = row.findElements(By.tagName("td"));
		 * 		for(WebElement col :column) 
		 * 			{ 	System.out.println(col.getText()); 
		 *			 } 
		 * }
		 */

		for (int row = 1; row < rowsTotal; row++) {
			List<WebElement> col = trows.get(row).findElements(By.tagName("td"));
			if (col.get(2).getText().equalsIgnoreCase("Lisa"))
				System.out.println("Job Title of Lisa is:" + col.get(4).getText());
		}

		driver.close();
	}

	
}
