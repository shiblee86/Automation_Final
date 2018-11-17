package com.loginfunction;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.generic.library.BaseGCRLogin;
import com.generic.library.GCRLogIn;

public class GcrLoginTest {
	
WebDriver driver;
	@Test
	public void gettest(){
	
	
		
		GCRLogIn obj = new GCRLogIn(driver);
		driver=obj.getLogIn();
		driver.quit();
		
		
	}
	

}
