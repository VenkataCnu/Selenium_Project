package com.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesReadFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties prop = new Properties();
		String path = "D:\\eclipse-workspace\\Selenium_Project\\ReadPropertyFile.properties";
		prop.load(new FileInputStream(path));

		System.out.println(prop.get("FirstName"));
		System.out.println(prop.get("LastName"));

		System.out.println(prop.containsKey("FirstName"));
		System.out.println(prop.containsValue("M.Tech"));

		System.out.println(prop.get("Proper"));

		System.out.println(prop.getProperty("Sports", "Cricket"));

		Set<Object> data = prop.keySet();
		java.util.Iterator<Object> itr = data.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Set<Entry<Object, Object>> name = prop.entrySet();
		java.util.Iterator<Entry<Object, Object>> itr1 = name.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	
	}

}
