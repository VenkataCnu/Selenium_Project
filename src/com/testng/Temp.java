package com.testng;

import org.testng.annotations.Test;

public class Temp {

	@Test(priority=1)
	public static void m1()
	{
		System.out.println("Method 1");
	}
	
	@Test(priority=2)
	public static void m2()
	{
		System.out.println("Method 2");
	}
	
	@Test(priority=3)
	public static void m3()
	{
		System.out.println("Method 3");
	}
	
	public static void m4()
	{
		System.out.println("Method 4");
	}
	
	@Test(priority=4)
	public static void m5()
	{
		System.out.println("Method 5");
	}
	
	
	
}
