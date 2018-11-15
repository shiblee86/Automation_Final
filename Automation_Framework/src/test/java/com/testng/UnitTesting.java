package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UnitTesting {
	@BeforeSuite
	public void test1() {
		System.out.println("This is BeforeSuite");
	}

	@BeforeTest
	public void test2() {
		System.out.println("This is BeforeTest");
	}

	@BeforeClass
	public void test3() {
		System.out.println("This is BeforeClass");
	}

	@BeforeMethod
	public void test4() {
		System.out.println("This is BeforeMethod");
	}

	@Test
	public void test5()  {
		
		
		System.out.println("This is Test");
		
		int a=0;
		int b=100;
		int c=100/0;
		System.out.println(c);
		
	}

	@AfterMethod
	public void closeMethod() {
		System.out.println("This is AfterMethod");
	}

	@AfterClass
	public void closeClass() {
		System.out.println("This is AfterClass");
	}

	@AfterTest
	public void close() {
		System.out.println("This is AfterTest");
	}

	@AfterSuite
	public void closeSuite() {
		System.out.println("This is AfterSuite");
	}

}
