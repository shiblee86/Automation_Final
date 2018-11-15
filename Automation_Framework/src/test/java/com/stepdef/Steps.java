package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.masterpagefactory.LoginPageFactory;
import com.util.Highlighter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	LoginPageFactory pf;
	Highlighter color;
	
	@Given("^User able to open any browser$")
	public void user_able_to_open_any_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		pf = PageFactory.initElements(driver, LoginPageFactory.class);
		color = new Highlighter(driver);
	    
	}

	@Given("^Put URL and go to login page$")
	public void put_URL_and_go_to_login_page() throws Throwable {
		 
		driver.get(pf.getURL());
	    
	}

	@When("^User able to click my account$")
	public void user_able_to_click_my_account() throws Throwable {
		color.drawBorder(pf.getMyaccount(), "red");
		pf.getMyaccount().click();
	    
	}

	@When("^User able to use valid user name \"([^\"]*)\"$")
	public void user_able_to_use_valid_user_name(String userName) throws Throwable {
	    
		 color.drawBorder(pf.getEmail(), "white");
			pf.getEmail().sendKeys(userName);
	}

	@When("^User able to put valid password \"([^\"]*)\"$")
	public void user_able_to_put_valid_password(String pass) throws Throwable {
	  
		color.drawBorder(pf.getPassword(), "green");
		pf.getPassword().sendKeys(pass);
	}

	@When("^User able to click submit button$")
	public void user_able_to_click_submit_button() throws Throwable {
		color.drawBorder(pf.getSigninbtn(), "blue");
		pf.getSigninbtn().click();
	    
	}

	@Then("^User able to validate Login status$")
	public void user_able_to_validate_Login_status() throws Throwable {
	    
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
