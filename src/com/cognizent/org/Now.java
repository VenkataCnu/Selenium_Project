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
		 // Actions act = new Actions(driver);
		 driver.findElement(By.xpath("//*[@id=\"mount_0_0_Lc\"]/div/div[1]/div/div[2]/div[4]/div[1]/div[1]/span/div/a[1]")).click();
		 driver.getCurrentUrl();	 
		 
		 
		// driver.navigate().back();
		 driver.switchTo().alert().dismiss();
	}

}
