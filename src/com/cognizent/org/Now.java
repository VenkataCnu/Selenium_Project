package com.cognizent.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Now {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys("cnu.agyarapu@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("SiMbA_1708");
		 driver.findElement(By.name("login")).click();
		 
		 driver.getCurrentUrl();	
		 driver.getTitle();
		 
		 
		// driver.navigate().back();
		 driver.switchTo().alert().dismiss();
		 driver.switchTo().alert().dismiss();
	}

}
