package com.cognizent.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Edureka {

	static WebDriver driver;
	static WebElement categories, subMenu, course;
	public static String driverPath = "D:\\Drivers\\Browser Drivers\\msedgedriver.exe";

	 public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	  driver.get("https://edureka.co");

	  categories = driver.findElement(By.xpath("//a[@class='cat_btn hidden-xs giTrackElementHeader']"));
	  subMenu = driver.findElement(By.xpath("//li[@class='course_category_name_menu']//a[@id='software-testing-certification-courses']"));
	  course = driver.findElement(By.id("c535"));

	  Actions action = new Actions(driver);
	  action.moveToElement(categories).perform();
	  action.moveToElement(subMenu).perform();
	  action.moveToElement(course).click().perform();
	  action.sendKeys(null);
	  
	//  Thread.sleep(3000);

	//  driver.close();
	}

	}

