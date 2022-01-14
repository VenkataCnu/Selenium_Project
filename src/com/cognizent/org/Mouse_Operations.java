package com.cognizent.org;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Operations {
public static void main (String [] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	
	Actions mo = new Actions (driver);
	
	// 1. Left Click Operations
	mo.click(driver.findElement(By.id("txtUsername"))).sendKeys("Admin").perform();
	mo.click(driver.findElement(By.id("txtPassword"))).sendKeys("admin123").perform();
	mo.click(driver.findElement(By.id("btnLogin"))).perform();
	mo.click(driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"))).perform();
	
	// 2. Right Click Operations
	mo.contextClick(driver.findElement(By.id("mo.click(driver.findElement(By.id(\"btnLogin\"))).perform();"))).perform();
	
	
	}

}
