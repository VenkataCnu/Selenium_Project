package com.cognizent.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clarify {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\Browser Drivers\\geckodriver.exe");
				
		WebDriver driver = new FirefoxDriver();
		driver.get("www.Facebook.com");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		driver.navigate().to("www.instagram.com");
		
	}

}
