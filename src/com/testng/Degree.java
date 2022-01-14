package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Degree {

	@Test (groups = "MyReal")
	public void bcom() {
		System.out.println("Welcome to the Bcom Class");
		Reporter.log("Bachelor in commerce", true);
	}

	@Test (groups = "Next")
	public void bsc() {
		System.out.println("This is Bsc Class");
		Reporter.log("Bachelor in Science", true);
	}

	@Test (groups = "Master")
	public void mcom() {
		System.out.println("This is Mcom Class");
		Reporter.log("Master in commerce", true);
	}

	@Test (groups = "Common")
	public void mpcs() {
		System.out.println("This is mpcs Class");
		Reporter.log("Maths Physics Commerse and Science", true);
	}

	@Test (groups = "Common")
	public void bzc() {
		System.out.println("This is Bzc Class");
		Reporter.log("Bachelor in Zoology", true);
	}

}
