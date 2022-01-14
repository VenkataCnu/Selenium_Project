package com.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Temporary {

	@Test
	public void pawanKalyan() {
		System.out.println("This is Power Star");
		Reporter.log("Khushi", true);
		org.testng.Assert.assertEquals(true, true);
	}

	@Test(dependsOnMethods = "pawanKalyan")
	public void maheshBabu() {
		System.out.println("This is Super Star");
		Reporter.log("Pokiri", true);
	}

	@Test(dependsOnMethods = "maheshBabu")
	public void jrNtr() {
		System.out.println("This is Young Tiger");
		Reporter.log("Simhadhri", true);
	}

	@Test(dependsOnMethods = "jrNtr")
	public void prabhas() {
		System.out.println("This is Rebel Star");
		Reporter.log("Varsham", true);
	}

	@Test(dependsOnMethods = "prabhas")
	public void raviteja() {
		System.out.println("This is Mass Maharaj");
		Reporter.log("Idiot", true);
	}

}
