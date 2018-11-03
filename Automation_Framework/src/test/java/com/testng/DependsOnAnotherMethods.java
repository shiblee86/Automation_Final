package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnAnotherMethods {
	 
		@Test 
		public void setupMethod() {
		 System.out.println("This is setupMethod"); 
		Assert.assertTrue(true,"Setup method will fail");
		}
		 @Test(dependsOnMethods = { "setupMethod" })
		 public void method2() {
		 System.out.println("This is method 2"); 
		 } 
		 @Test(dependsOnMethods = { "method2" })
		 public void method3() {
		 System.out.println("This is method 2"); 
		 } 
		} 


