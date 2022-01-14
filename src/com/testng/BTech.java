package com.testng;

import org.testng.annotations.Test;

public class BTech {
	@Test (groups = "MyReal")
	public void eee() {
		System.out.println("Welcome to Electrical and Electronics Engineering");
	}

	@Test (groups = "Common")
	public void cse() {
		System.out.println("Welcome to Computer Science Engineering");
	}

	@Test (groups = "Common")
	public void ece() {
		System.out.println("Welcome to Electronics and Communication Engineering");
	}

	@Test (groups = "Next")
	public void ce() {
		System.out.println("Welcome to Civil Engineering");
	}

	@Test (groups = "Next")
	public void me() {
		System.out.println("Welcome to Mechanical Engineering");
	}

	
}
