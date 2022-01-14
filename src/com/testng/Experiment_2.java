package com.testng;

import org.testng.annotations.Test;

public class Experiment_2 {
	@Test (groups = { "Common", "Hard"})
	public void ee1() {
		System.out.println("This is ee1 method");
	}

	@Test (groups = {"Medium", "VeryHard"})
	public void ee2() {
		System.out.println("This is ee2 method");
	}

	@Test (groups = { "Common", "Medium"})
	public void ee3() {
		System.out.println("This is ee3 method");
	}

	@Test (groups = {"Very Hard"})
	public void ee4() {
		System.out.println("This is ee4 method");
	}

	@Test (groups = {"Medium"})
	public void ee5() {
		System.out.println("This is ee5 method");
	}
}
