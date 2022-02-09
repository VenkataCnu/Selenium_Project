package com.cognizent.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Temp {

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
		
		List<WebElement> trows= driver.findElement(By.id("resultTable")).findElements(By.tagName("tr"));
		int totalrows = trows.size();
		
		List <WebElement> tcols = trows.get(1).findElements(By.tagName("td"));
		int totalCols = tcols.size();
		
		for(int i=1;i<=totalrows;i++)
		{
			List <WebElement> cols = trows.get(i).findElements(By.tagName("td"));
			int no=cols.size();
			
		if(cols.get(2).getText().equalsIgnoreCase("Fiona")) 
		{
			for(int j=1;j<=no;j++) 
			{
				System.out.println(cols.get(j).getText());
			}
		} 
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}