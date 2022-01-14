package com.cognizent.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		Dimension d= new Dimension(1200, 1200);
		driver.manage().window().setSize(d);
	
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement x=driver.findElement(By.id("menu_admin_viewAdminModule"));
		
		Actions a=new Actions(driver);
		// a.moveToElement(x).build().perform();
		a.doubleClick(x).build().perform();
		
		driver.navigate().to("https://instagram.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		
		
	}

}
