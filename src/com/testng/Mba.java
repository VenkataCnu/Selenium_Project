package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Mba {
	@Test (groups = "Master")
	public void finance() {
		System.out.println("This is Finance Department");
	}

	@Test (groups = "Common")
	public void marketing() {
		System.out.println("This is Marketing Department");
	}

	@DataProvider (name = "OtherClassMethod")
	public String[][] otherNames() {
		String[][] names = new String[3][2];
		names [0][0] = "Kedar";
		names [0][1] = "Suraj";
		
		names [1][0] = "Arla";
		names [1][1] = "Suresh";
		
		names [2][0] = "Miriyala";
		names [2][1] = "Shiva";

		return names;

	}

}
