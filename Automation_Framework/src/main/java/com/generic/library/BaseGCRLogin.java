package com.generic.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.loginpfmaster.LoginPageFactory;
import com.util.Highlighter;
import com.util.screenShot;

public class BaseGCRLogin {

	WebDriver driver ;
	LoginPageFactory pf ;

	Highlighter color;
	
	
	public void getsetup() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		 driver = new ChromeDriver();
		 pf = PageFactory.initElements(driver, LoginPageFactory.class);
		 color = new Highlighter(driver); 
		driver.get(pf.getURL());
		driver.manage().window().maximize();
		
	}

	public void gcrLogin() {

		screenShot.captureScreenShot(driver, "LoginPage");
		color.drawBorder(pf.getMyaccount(), "green");
		pf.getMyaccount().click();
		color.drawBorder(pf.getEmail(), "red");
		pf.getEmail().sendKeys(pf.getUserName());
		color.drawBorder(pf.getPassword(), "yellow");
		pf.getPassword().sendKeys(pf.getPass());
		color.drawBorder(pf.getSigninbtn(), "blue");
		pf.getSigninbtn().click();

	}

	public void loginValidation() {
		screenShot.captureScreenShot(driver, "Login Success");
		color.drawBorder(pf.getMyaccountinformation(), "red");
		if (pf.getMyaccountinformation().getText().equals("My Account Information")) {

			System.out.println("Login Passed");

		} else {
			System.out.println("Login Failed");

		}

		// validation or assert in selenium

		Assert.assertEquals("My Account Information",pf.getMyaccountinformation().getText());

	}

	public void tearDown() {
		driver.quit();

	}

}
