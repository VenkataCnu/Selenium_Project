package com.cognizent.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		 jse.executeScript("document.getElementById('txtUsername').value='Admin';");
		 jse.executeScript("document.getElementById('txtPassword').value='admin123';");
		 jse.executeScript("document.getElementById('btnLogin').click()");
		 
		 String fl = "D:/image.jpeg";
		 File dst = new File(fl);
		 TakesScreenshot shot = (TakesScreenshot)driver;
		 File src= shot.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, dst);
		 	 
	}

}
