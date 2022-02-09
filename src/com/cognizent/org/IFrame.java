package com.cognizent.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		
		List <WebElement> list = driver.findElements(By.tagName("frame"));

		for(WebElement e:list)
		{
			System.out.println("Number of frames are"+list.size());
			System.out.println("Names of Frames are : "+e.getAttribute("Name"));
			System.out.println("ids of frame"+e.getAttribute("id"));
			
			
		}
		
		WebElement element = driver.findElement(By.xpath("//*[@id='nwXtfULse2hx0PD_iRt8mQ']/div[1]/h2"));
		((JavascriptExecutor)driver).executeScript("arguments[0].ScrollIntoView(true)",element);
	}

}
