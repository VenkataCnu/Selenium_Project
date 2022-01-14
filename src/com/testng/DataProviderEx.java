package com.testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

	@Test(dataProvider = "setNames")
	public void getNames(String fname, String lname) {
		Reporter.log(fname, true);
		Reporter.log(lname, true);
	}

	@Test(dataProvider = "OtherClassMethod", dataProviderClass = Mba.class)
	public void getOtherNames(String fname, String lname) {
		Reporter.log(fname, true);
		Reporter.log(lname, true);
	}

	@DataProvider
	public String[][] setNames() {
		String[][] names = new String[3][2];
		names[0][0] = "Pilli";
		names[0][1] = "Adithya";

		names[1][0] = "Salla";
		names[1][1] = "Jogishwar";

		names[2][0] = "Thummanapelly";
		names[2][1] = "Venkatesh";

		return names;

	}
}
