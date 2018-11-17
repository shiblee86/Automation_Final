package com.testng;

import org.testng.annotations.Test;

public class ExceptionInJava {

	
	@Test
	public void test1() {
		System.out.println("Test one");
		
	}
	
	@Test(dependsOnMethods = { "test1" })
	public void test2() {
		System.out.println("This is Test two");
		
		int a=0;
		int b=100;
		int c=100/0;
		System.out.println(c);
		
	}
	@Test(dependsOnMethods = { "test2" })
	public void test3() {
		System.out.println("This is Test three");
	
		
	}

	
	
}
