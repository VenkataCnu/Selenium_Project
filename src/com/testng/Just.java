package com.testng;

import org.testng.annotations.Test;

public class Just 
{
	
	@Test(priority=1)
	public void method1()
	{
		System.out.println("M-1");
	}
	
	@Test(priority=2)
	public void method2()
	{
		System.out.println("M-2");
		
	}
	
	@Test(priority=-12)
	public void method3()
	{
		System.out.println("M-3");
	}

	
	@Test(priority=-9)
	public void method4()
	{
		System.out.println("M-4");
	}

}
