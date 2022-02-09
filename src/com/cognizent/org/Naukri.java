package com.cognizent.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Naukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\Drivers\\Browser Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		/* String a=driver.getWindowHandle();
		System.out.println("Current Window Handle Name is:  "+a);
	*/
	}

}
