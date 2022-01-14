package com.cognizent.org;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_2 {
	
	public static void main(String[] args) 
	{
		WebDriver driver = getDriver("edge");
		driver.get("https://Instagram.com");
		System.out.println("The Title of the Window is :"+driver.getTitle());
	}

	public static WebDriver getDriver (String brName) {
		
		WebDriver driver;
		
		if(brName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Drivers\\Browser Drivers\\chromedriver.exe" );
			driver = new ChromeDriver();
		}
		else if(brName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Drivers\\Browser Drivers\\geckodriver.exe" );
			driver = new FirefoxDriver();
		}
		else if(brName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\Drivers\\Browser Drivers\\msedgedriver.exe" );
			driver = new EdgeDriver();
		}
		else {
			driver = null;
		}
		return driver;
		
		
	}
	
	
}
