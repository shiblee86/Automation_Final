package com.generic.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.loginpfmaster.LoginPageFactory;

public class BaseGCRLogin {

	WebDriver driver ;
	LoginPageFactory pf ;

	public void getsetup() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		 driver = new ChromeDriver();
		 pf = PageFactory.initElements(driver, LoginPageFactory.class);
		driver.get(pf.getURL());
		driver.manage().window().maximize();

	}

	public void gcrLogin() {

		pf.getMyaccount().click();

		pf.getEmail().sendKeys(pf.getUserName());

		pf.getPassword().sendKeys(pf.getPass());

		pf.getSigninbtn().click();

	}

	public void loginValidation() {
		// verification or verify

		if (pf.getMyaccountinformation().getText().equals("My Account Information")) {

			System.out.println("Login Passed");

		} else {
			System.out.println("Login Failed");

		}

		// validation or assert in selenium

		// Assert.assertEquals("My Account Information",
		// pf.getMyaccountinformation().getText());

	}

	public void tearDown() {
		driver.quit();

	}

}
