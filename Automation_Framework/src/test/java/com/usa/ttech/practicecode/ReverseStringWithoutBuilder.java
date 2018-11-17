package com.usa.ttech.practicecode;

public class ReverseStringWithoutBuilder {

	public static void main(String[] args) {
	
			      String country = "United State Of America";
			      char[] arrayOfCountry = country.toCharArray();
			      for (int i = arrayOfCountry.length-1;i>=0;i--) {
			    	  
			    	  System.out.print(arrayOfCountry[i]);
			      }
			   }
}