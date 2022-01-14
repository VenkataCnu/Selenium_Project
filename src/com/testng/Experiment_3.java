package com.testng;

import org.testng.annotations.Test;

public class Experiment_3 {
	@Test (groups = { "Common", "Medium" })
	public void ec1() {
		System.out.println("This is ec1 Method");
	}

	@Test (groups = { "Medium", "Hard"})
	public void ec2() {
		System.out.println("This is ec2 Method");
	}

	@Test (groups = "Common")
	public void ec3() {
		System.out.println("This is ec3 Method");
	}

	@Test (groups = {"Hard","Very Hard"})
	public void ec4() {
		System.out.println("This is ec4 Method");
	}

	@Test
	public void ec5() {
		System.out.println("This is ec5 Method");
	}

}
