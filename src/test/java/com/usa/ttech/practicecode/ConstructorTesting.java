package com.usa.ttech.practicecode;

public class ConstructorTesting extends TestCase {
	
	
	public ConstructorTesting(String name) {
		super(name);
		
	}

	public static void main(String[] args) {
		TestCase obj = new TestCase("sarower");
		obj.getbalance();
		
	}
	

}
