package com.testng;

import org.testng.annotations.Test;

public class Experiment_1 {
	@Test (groups = { "Common" })
	public void ce1() {
		System.out.println("This is ce1 method");
	}

	@Test (groups = { "Very Hard", "Medium" })
	public void ce2() {
		System.out.println("This is ce2 method");
	}

	@Test (groups = {"Hard", "Common"})
	public void ce3() {
		System.out.println("This is ce3 method");
	}

	@Test (groups = { "Common", "Medium"})
	public void ce4() {
		System.out.println("This is ce4 method");
	}

	@Test (groups = "Medium")
	public void ce5() {
		System.out.println("This is ce5 method");
	}
}
