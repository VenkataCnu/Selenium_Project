package com.cognizent.org;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Ex {

	public static void main(String[] args) {
		WebDriver driver = Example_2.getDriver("chrome");
		driver.get( "https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
			
		
		
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement element = driver.findElement(By.xpath("//span[@text()='Username']"));
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.attributeContains(element, "Style", "display:none"));
			
			System.out.println("After Wait");
			
			
			/* driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click(); */
			
			
			
			
			
			
	}

}
