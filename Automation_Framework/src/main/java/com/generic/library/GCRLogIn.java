package com.generic.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.masterpagefactory.MasterPageFactory;
import com.util.Highlighter;
import com.util.screenShot;

public class GCRLogIn {
	WebDriver driver;
	MasterPageFactory pf;
	Highlighter color;

	public GCRLogIn(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver getLogIn() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		pf = PageFactory.initElements(driver, MasterPageFactory.class);
		color = new Highlighter(driver);
		driver.get(pf.getURL());
		driver.manage().window().maximize();
		screenShot.captureScreenShot(driver, "LoginPage");
		color.drawBorder(pf.getMyaccount(), "green");
		pf.getMyaccount().click();
		color.drawBorder(pf.getEmail(), "red");
		pf.getEmail().sendKeys(pf.getUserName());
		color.drawBorder(pf.getPassword(), "yellow");
		pf.getPassword().sendKeys(pf.getPass());
		color.drawBorder(pf.getSigninbtn(), "blue");
		pf.getSigninbtn().click();
		screenShot.captureScreenShot(driver, "Login Success");
		color.drawBorder(pf.getMyaccountinformation(), "red");
		if (pf.getMyaccountinformation().getText().equals("My Account Information")) {

			System.out.println("Login Passed");

		} else {
			System.out.println("Login Failed");

		}

		// validation or assert in selenium

		Assert.assertEquals("My Account Information", pf.getMyaccountinformation().getText());
		return driver;
		

	}
	
}
