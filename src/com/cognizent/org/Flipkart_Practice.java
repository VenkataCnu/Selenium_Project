package com.cognizent.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		// Login Page 
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN'][1]/input")).sendKeys("9542336206");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shrivas_206");
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		 
		 // Orders History
		//  driver.findElement(By.xpath("//div[@class='_1cmsER']/following-sibling::div[1]/*/*/*/*")).click();
		 driver.findElement(By.xpath("_2kxeIr")).click();
		 
		 
		 
	}
}
