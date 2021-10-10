package com.test;

public class TestConstructor {
	
	
	public int i = 1;
	public String str = "I am public";
	
	
	private TestConstructor() {
		System.out.println("I am default private");
	}
	
	private TestConstructor(String ar) {
		System.out.println("I am parameterized private = "+ ar);
	}

}
