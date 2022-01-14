package com.cognizent.org;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preperation {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		try {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Subhash chandhra");
		driver.findElement(By.id("lastName")).sendKeys("Bose");
		driver.findElement(By.id("btnSave")).click(); 
		}
		
		catch(Exception e){
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//FileUtils.copyFile(file, new File("D:\\SoftwareTestingMaterial.png"));
			
			
		}
		
		finally {
			
			System.out.println("Work Done Succesfully");
			
			
		}
	
		/*	Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		act.moveToElement(element).build().perform();
	*/
		
		
		
		
		
	}
}	
		