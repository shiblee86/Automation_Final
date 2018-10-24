package com.loginfunction;

import com.generic.library.BaseGCRLogin;

public class GcrLoginTest {
	

	public static void main(String[] args) {
	
		BaseGCRLogin obj = new BaseGCRLogin();
		obj.getsetup();
		obj.gcrLogin();
		obj.loginValidation();
		obj.tearDown();
		
		
		
	}
	

}
