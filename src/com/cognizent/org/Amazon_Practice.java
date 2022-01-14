package com.cognizent.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon_Practice {

	public static void main(String[] args) {
		WebDriver driver = Example_2.getDriver("Firefox");
		driver.get("https://wikipedia.com");
		driver.manage().window().maximize();
		String url = "https://twitter.com";
		driver.navigate().to(url);
		driver.navigate().back();
		
		
		
		
		/*	driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("cnu.agyarapu@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Shrivas_206");
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.navigate().to("https://facebook.com");*/
				
				

}

}
