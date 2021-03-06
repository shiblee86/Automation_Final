package com.masterpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {

	WebDriver driver;
	
	public LoginPageFactory(WebDriver driver){
		this.driver=driver;
	}
	
	
	

	@FindBy(xpath = "(//*[@class='ui-button-text'])[3]")
	private WebElement myaccount;
	
	@FindBy(xpath = "//*[contains(text(),'My Account Information')]")
	private WebElement myaccountinformation;
	
	
	@FindBy(xpath = "//*[@name = 'email_address']")
	private WebElement email;

	@FindBy(xpath = "//*[@name = 'password']")
	private WebElement password;

	@FindBy(xpath = "(//*[@class = 'ui-button-text'])[5]")
	private WebElement signinbtn;


	

	private String URL = "http://www.gcrit.com/build3/";
	private String userName = "sarowerny@gmail.com";
	private String pass = "student";
	
	
	

	public WebElement getMyaccount() {
		return myaccount;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSigninbtn() {
		return signinbtn;
	}
	public String getURL() {
		return URL;
	}
	public String getUserName() {
		return userName;
	}
	public String getPass() {
		return pass;
	}
	public WebElement getMyaccountinformation() {
		return myaccountinformation;
	}

	
	
	
}
