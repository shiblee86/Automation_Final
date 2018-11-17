package com.stepdef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.generic.library.BaseGCRLogin;
import com.generic.library.GCRLogIn;
import com.masterpagefactory.LoginPageFactory;
import com.masterpagefactory.MasterPageFactory;
import com.util.Highlighter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.emory.mathcs.backport.java.util.Arrays;

public class ProductStepsDef {
	WebDriver driver;
	MasterPageFactory pf;
	Highlighter color;
	Actions ac;
	List<String> porductList= new ArrayList<>();
	@Given("^User able to login successfully with valid credential$")
	public void user_able_to_login_successfully_with_valid_credential() throws Throwable {
		
		GCRLogIn obj = new GCRLogIn(driver);
		driver=obj.getLogIn();
		pf = PageFactory.initElements(driver, MasterPageFactory.class);
		color = new Highlighter(driver);
		ac= new Actions(driver);
	}

	@Given("^Click the catalog$")
	public void click_the_catalog() throws Throwable {
		color.drawBorder(pf.getCatalogBtn(), "red");
		pf.getCatalogBtn().click();
		
		System.out.println("Clicked new cataloglink");
	}

	@Given("^Click new product$")
	public void click_new_product() throws Throwable {
		color.drawBorder(pf.getNewProductblink(), "bule");
		pf.getNewProductblink().click();
		System.out.println("Clicked new product link");
	   
	}

	@When("^Check total product count and check current page number$")
	public void check_total_product_count_and_check_current_page_number() throws Throwable {
	 
		ac.moveToElement(pf.getTotalproductCount()).build().perform();
		color.drawBorder(pf.getTotalproductCount(), "bule");
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Total product NO::"+pf.getTotalproductCount().getText());
		 System.out.println("-----------------------------------------------------");
			ac.moveToElement(pf.getCurrentPageNo()).build().perform();
			color.drawBorder(pf.getCurrentPageNo(), "red");
		System.out.println("Current page NO:"+pf.getCurrentPageNo().getText());
		
		Thread.sleep(3000);
		
	}

	@When("^Find out all product name with total count in page one and page two$")
	public void find_out_all_product_name_with_total_count_in_page_one_and_page_two() throws Throwable {   
		
		color.drawBorder(pf.getAllPageNo().get(0), "orange");
		System.out.println("Total page no ::"+(pf.getAllPageNo().size()-1));
		
		for(int i=0;i<pf.getAllPageNo().size();i++) {
		if(i==0 || i==1) {
			pf.getAllPageNo().get(i).click();
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(pf.getAllProductDisplayinPage().get(0)));
			
		for(WebElement product:pf.getAllProductDisplayinPage()) {
			ac.moveToElement(product).build().perform();
			porductList.add(product.getText());
			color.drawBorder(product, "yellow");
		}
		}
		}
		 System.out.println("-----------------------------------------------------");
		System.out.println(porductList);
		 System.out.println("-----------------------------------------------------");
	}

	@When("^Remove all duplicate value from the list$")
	public void remove_all_duplicate_value_from_the_list() throws Throwable {
	    
		List<String> noduplicate = porductList.stream().distinct().collect(Collectors.toList());
		 System.out.println("-----------------------------------------------------");
		System.out.println("Remove duplicateproduct::"+noduplicate);
		 System.out.println("-----------------------------------------------------");
		 List<String> duplicate = new ArrayList<>();
		 for (int i = 0; i < porductList.size(); i++) {
		      String item = porductList.get(i);
		      if (!duplicate.contains(item)) {
		           duplicate.add(item);
		          }
		      }
		 System.out.println("Remove duplicateproduct::"+duplicate); 
		 
		
	}

	
	@When("^Show only duplicate product$")
	public void show_only_duplicate_product() throws Throwable {
		 List<String> duplicates =    porductList.stream().filter(d -> Collections.frequency(porductList, d) > 1).distinct().collect(Collectors.toList());
			
		 System.out.println("-----------------------------------------------------");
			
		 System.out.println("Only duplicateproduct::"+duplicates);
		 System.out.println("-----------------------------------------------------");
			
	}
	@When("^Find out how many shampoo in the list and each items count$")
	public void find_out_how_many_shampoo_in_the_list_and_each_items_count() throws Throwable {
		
		int count=0;
	List<Integer> totalShapmoo= new ArrayList<>();
		for (int i = 0; i < porductList.size(); i++) {
		    if ((porductList.get(i).equalsIgnoreCase("Shampoo"))) {
		        count++;
		        totalShapmoo.add(count);
		    }
		}
	System.out.println("Total shampoo found::"+totalShapmoo.size());
	
		Map<String, Long> counts =
				porductList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		 System.out.println("--------------Items with count Below ---------------------------------------");
		counts.forEach((key, value) -> System.out.println(key + ":" + value));
		 System.out.println("-----------------------------------------------------");
		 
	}

	
	@Then("^Add one shampoo to cart$")
	public void add_one_shampoo_to_cart() throws Throwable {
		for(WebElement product:pf.getAllProductDisplayinPage()) {
			if(product.getText().equalsIgnoreCase("Shampoo")) {
				
				product.click();
				pf.getAddToCrat().click();
				break;
			}			
		}
	   
		driver.quit();
	}
	
	
}