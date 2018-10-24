package com.testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.library.BaseGCRLogin;
import com.loginpfmaster.LoginPageFactory;

public class LoginTestng {
	

	BaseGCRLogin obj = new BaseGCRLogin();
	
	@BeforeTest
	public void getsetup() {
		
		obj.getsetup();
	}
	@Test
	public void gcrLogin() {
		
		obj.gcrLogin();

	}
	@Test
	public void loginValidation() {
		
		obj.loginValidation();



	}
	@AfterTest
	public void tearDown() {
		
		obj.tearDown();;


	}

}

