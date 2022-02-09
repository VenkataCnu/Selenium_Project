package com.cognizent.org;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1 {


	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		 jse.executeScript("document.getElementById('txtUsername').value='Admin';");
		 jse.executeScript("document.getElementById('txtPassword').value='admin123';");
		 jse.executeScript("document.getElementById('btnLogin').click()");
		 
		 
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		System.out.println(driver.getClass());
		System.out.println(driver.hashCode());
			
		
		// driver.close();	
		
	}

}
