package com.cognizent.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		String cu=driver.getCurrentUrl();
		System.out.println(cu);
		
		String cw = driver.getWindowHandle();
		System.out.println(cw+"is the Current Window Handle");
		
		WebElement elem = driver.findElement(By.id("txtUsername"));
		Actions act = new Actions(driver);
		// act.moveToElement(driver.findElement(By.id("txtUsername"))).build().perform();
		act.contextClick(elem).perform();
		
		
		
		
		
		
	
	}

}
