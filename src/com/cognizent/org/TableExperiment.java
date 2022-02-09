package com.cognizent.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TableExperiment {

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

		List<WebElement> trows = driver.findElement(By.xpath("//*[contains(@id,'resultTable')]")).findElements(By.tagName("tr"));
		int totalRows = trows.size();
		System.out.println(totalRows);
		
		List<WebElement> tcols = trows.get(1).findElements(By.tagName("td"));
		int totalCols = tcols.size();
		System.out.println(totalCols);
		
		/* for(WebElement row: trows) 
		{
		List<WebElement> cols = row.findElements(By.tagName("td"));
		for(WebElement col:cols) 
		{
			System.out.println(col.getText());
		}
			
		} */
		
		for(int i=1;i<totalRows;i++)
		{
		List<WebElement> col =trows.get(i).findElements(By.tagName("td"));
		if(col.get(3).getText().equalsIgnoreCase("Anderson")) 
		{
			System.out.println(col.get(2).getText());
		}
		
		}
		
	
	}
	

}
