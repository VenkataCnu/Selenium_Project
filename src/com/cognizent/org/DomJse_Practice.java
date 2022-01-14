package com.cognizent.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DomJse_Practice {

	public static void main(String[] args)
	{
		WebDriver driver = Example_2.getDriver("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		// Javascript Executor referance
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// Method 1
		WebElement username = driver.findElement(By.id("txtUsername"));
		jse.executeScript(" argument[0].value='Admin';", username);
		
		// Method 2
		jse.executeScript("document.getElementById('txtPassword'),value='admin123'");
		
		// Method 3
		WebElement sign_in = (WebElement)jse.executeScript("document.getElementById('btnLogin');"); 
		sign_in.click();
		
		
		
		
		
	}
}
