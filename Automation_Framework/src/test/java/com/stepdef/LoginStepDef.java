package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.extentreport.BaseExtentReport;
import com.masterpagefactory.LoginPageFactory;
import com.util.Highlighter;
import com.util.screenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	WebDriver driver ;
	LoginPageFactory pf ;
	Highlighter color;
	
	@Given("^User able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		pf = PageFactory.initElements(driver, LoginPageFactory.class);
		color = new Highlighter(driver);
		screenShot.deleteScreenShorFolder();
		driver.manage().window().maximize();

	    
	}

	@Given("^Put URL and go to login page$")
	public void put_URL_and_go_to_login_page() throws Throwable {
		driver.get(pf.getURL());
	    
	}

	@When("^User able to click my account$")
	public void user_able_to_click_my_account() throws Throwable {
		screenShot.captureScreenShot(driver, "LoginPage");
		color.drawBorder(pf.getMyaccount(), "green");
		pf.getMyaccount().click();
	    
	}

	@When("^User able to use valid userName$")
	public void user_able_to_use_valid_userName() throws Throwable {
		
		color.drawBorder(pf.getEmail(), "red");
		pf.getEmail().sendKeys(pf.getUserName());
		
	    
	}

	@When("^User able to put valid password$")
	public void user_able_to_put_valid_password() throws Throwable {
	    
		color.drawBorder(pf.getPassword(), "yellow");
		pf.getPassword().sendKeys(pf.getPass());
	}

	@When("^User able to click submit button$")
	public void user_able_to_click_submit_button() throws Throwable {
	    
		color.drawBorder(pf.getSigninbtn(), "blue");
		pf.getSigninbtn().click();
	}

	@Then("^User able to validate Login status$")
	public void user_able_to_validate_Login_status() throws Throwable {
		screenShot.captureScreenShot(driver, "Login Success");
		color.drawBorder(pf.getMyaccountinformation(), "red");
		if (pf.getMyaccountinformation().getText().equals("My Account Information")) {

			System.out.println("Login Passed");

		} else {
			System.out.println("Login Failed");

		}

		// validation or assert in selenium

		Assert.assertEquals("My Account Information", pf.getMyaccountinformation().getText());

	    
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
	    driver.quit();
	}

	
	

}