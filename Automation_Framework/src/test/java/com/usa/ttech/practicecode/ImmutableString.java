package com.usa.ttech.practicecode;

public class ImmutableString {

	public static void main(String[] args) {
		String s1 = "java";
		s1.concat(" rules");// concat method will add
		System.out.println("s1 refers to "+s1);  // Yes, s1 still refers to "java"

		StringBuffer sb = new StringBuffer("java");
		sb.append(" rules");//append method will add
		System.out.println(sb.toString()); //Now sb refers to "java rules"


	}

}
