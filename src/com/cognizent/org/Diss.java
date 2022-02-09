package com.cognizent.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Diss {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		 jse.executeScript("document.getElementById('txtUsername').value='Admin';");
		 jse.executeScript("document.getElementById('txtPassword').value='admin123';");
		 jse.executeScript("document.getElementById('btnLogin').click()");
		 
		 driver.findElement(By.id("menu_pim_viewPimModule")).click();
		 driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		Select sl = new Select (driver.findElement(By.id("empsearch_termination")));
		 List <WebElement> list = sl.getOptions();
		for(WebElement e:list) 
		{
			String k = e.getText();
			System.out.println(k);
		}
		 
		 
		 

		  
	
	
	}
	
	}
