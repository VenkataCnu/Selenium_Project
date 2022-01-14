package com.testng;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties a = new Properties();
		String path = "D:\\eclipse-workspace\\Selenium_Project\\WritePropertyFile.properties";
	
		a.put("Class", "EEE");
		a.put("Section", "A");
		a.put("Name", "Srinivas");
		a.put("Group", "Team 5");
		a.store(new FileOutputStream(path), "This is Output Stream");
		System.out.println("Work Done");
	}

}
