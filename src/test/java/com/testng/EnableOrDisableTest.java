package com.testng;

import org.testng.annotations.Test;

public class EnableOrDisableTest {

	
	@Test(enabled=true)
	public void firstTest() {
		System.out.println("This is First Test");
	}
	@Test(enabled=false)
	public void secondTest() {
		System.out.println("This is Second Test");
	}
	@Test(enabled=true)
	public void thirdtest() {
		System.out.println("This is Third Test");
	}
}
