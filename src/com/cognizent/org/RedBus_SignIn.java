package com.cognizent.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RedBus_SignIn {

	public static void main(String[] args) {

		WebDriver driver = Example_2.getDriver("Chrome");
		driver.get("https://redbus.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.id("signInLink")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		driver.findElement(By.id("mobileNoInp")).sendKeys("0123456789");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']]")));
		driver.findElement(By.xpath("//span[@id='button-label']/preceding-sibling::span")).click();
	
	
	
	
	}
	}
