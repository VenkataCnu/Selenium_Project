package com.cognizent.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpath_Ex {

	public static void main(String[] args) {
		WebDriver driver = Example_2.getDriver("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.xpath("//a/b[text()='PIM']")).click();	
	
		driver.findElement(By.xpath("//a[contains(text='Add Employee')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']]")).sendKeys("Subhash");
		driver.findElement(By.xpath("//input[@name='middleName']]")).sendKeys("Chandhra");
		driver.findElement(By.xpath("//input[@name='lastName']]")).sendKeys("Bose");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	
	
	}

}
