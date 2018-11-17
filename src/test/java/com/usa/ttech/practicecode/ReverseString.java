package com.usa.ttech.practicecode;

public class ReverseString {

	public static void main(String[] args) {
	
		String country= new String("United State Of America");
		//String country="United State Of America";

		String newobj = new StringBuffer(country).reverse().toString();
		System.out.println(newobj);
		
	
		for(int i=0;i<country.length();i++) {
			
			if(country.charAt(i)=='e') {
				
				System.out.println(country.charAt(i));
				System.out.println("Index of e::"+ i);
				
			}
		}
		
		
			String [] s=country.split(" ");
				for(int i=0;i<s.length;i++){
					
					System.out.println(s[i]);
				
				}

		
		
		
		
		
		
		
	}

}
