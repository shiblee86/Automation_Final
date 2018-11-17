package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.generic.library.GCRLogIn;
import com.masterpagefactory.MasterPageFactory;
import com.util.Highlighter;
import com.util.screenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class PayementStepDef {

	WebDriver driver;
	MasterPageFactory pf;
	Highlighter color;
	
	@Given("^Loging GCRshop with valid credentials$")
	public void loging_GCRshop_with_valid_credentials() throws Throwable {
	 
		GCRLogIn obj = new GCRLogIn(driver);
		driver=obj.getLogIn();
		pf = PageFactory.initElements(driver, MasterPageFactory.class);
		color = new Highlighter(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Then("^Click the cart and validate shampoo inside$")
	public void click_the_cart_and_validate_shampoo_inside() throws Throwable {
	 
		color.drawBorder(pf.getShoppingCart().get(0), "red");
		
		pf.getShoppingCart().stream()
        .filter(elemnt -> elemnt.isDisplayed())
        .findFirst()
        .get().click();
	   System.out.println("=====================================");
		pf.getCartProduct().forEach(product ->{
			color.drawBorder(product, "green");
		    System.out.println("product name inside cart::"+product.getText());
		});
		
		
	}

	@When("^Update shampoo number three$")
	public void update_shampoo_number_three() throws Throwable {
		
		color.drawBorder(pf.getProductNoInsideCart().get(0), "blue");
		
		pf.getProductNoInsideCart().stream()
        .filter(elemnt -> elemnt.isDisplayed())
        .findFirst()
        .get().clear();
		
		
		color.drawBorder(pf.getProductNoInsideCart().get(0), "yellow");
		pf.getProductNoInsideCart().stream()
        .filter(elemnt -> elemnt.isDisplayed())
        .findFirst()
        .get()
        .sendKeys("3");
	   
	}

	@When("^click checkout$")
	public void click_checkout() throws Throwable {
		
		color.drawBorder(pf.getCheckOutBtn().get(0), "red");
		
		pf.getCheckOutBtn().stream()
        .filter(elemnt -> elemnt.isDisplayed())
        .findFirst()
        .get().click();
	   
	}

	@Then("^validate address box is there or not$")
	public void validate_address_box_is_there_or_not() throws Throwable {
	 
		System.out.println("=====================================");
			pf.getShippindAddreddBox().forEach(address ->{
				color.drawBorder(address, "white");
			    System.out.println("Address found::");
			    System.out.println("--------------------------------");
				System.out.println(address.getText());
			});
			System.out.println("=====================================");
	}

	@Then("^check the shipping method$")
	public void check_the_shipping_method() throws Throwable {
		
		pf.getShippingMethods().forEach(address ->{
			color.drawBorder(address, "orange");
		    System.out.println("Shipping Method Found::"+address.getText());
		});
		System.out.println("=====================================");
	   
	}

	@When("^add comment to \"([^\"]*)\" and Click continue$")
	public void add_comment_to_and_Click_continue(String comment) throws Throwable {
	 
		color.drawBorder(pf.getAddCommentBox().get(0), "orange");
		pf.getAddCommentBox().stream()
        .filter(elemnt -> elemnt.isDisplayed())
        .findFirst()
        .get()
        .sendKeys(comment);
		System.out.println("=====================================");
		System.out.println("Put my Comment::"+comment);
		color.drawBorder(pf.getConinueBtn().get(0), "orange");
		pf.getConinueBtn().stream()
        .filter(elemnt -> elemnt.isDisplayed())
        .findFirst()
        .get().click();
	}

	@When("^select payment options- cash delivery and continue$")
	public void select_payment_options_cash_delivery_and_continue() throws Throwable {
	 
		color.drawBorder(pf.getAllPayementOptions().get(0), "yellow");
		pf.getAllPayementOptions().stream()
        .filter(elemnt -> elemnt.getText().contains("Cash on Delivery"))
        .findFirst()
        .get().click();
		color.drawBorder(pf.getConinueBtn().get(0), "yellow");
		
		pf.getConinueBtn().stream()
        .filter(elemnt -> elemnt.isDisplayed())
        .findFirst()
        .get().click();
		
	}

	@When("^take a screen shot of your order$")
	public void take_a_screen_shot_of_your_order() throws Throwable {
	 
	   screenShot.captureScreenShot(driver, "Payement");
	}

	@When("^confirmed your order$")
	public void confirmed_your_order() throws Throwable {
		
		color.drawBorder(pf.getConfirmedOrderbtn().get(0), "yellow");
		pf.getConfirmedOrderbtn().stream()
        .filter(elemnt -> elemnt.isDisplayed())
        .findFirst()
        .get().click();
		
	 
		pf.getValidateOrderText().forEach(text ->{
			color.drawBorder(text, "red");
			System.out.println("=====================================");
		    System.out.println("Payement Validation Text::"+text.getText());
			System.out.println("=====================================");
			Assert.assertEquals(text.getText(), "Your Order Has Been Processed!");
		});

		
		
		driver.quit();
	}

	
}
