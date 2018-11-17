package com.masterpagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class LoginPageFactory {

	private final WebDriver driver;

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
	}

	private String URL = "http://www.gcrit.com/build3/";
	private String userName = "sarowerny@gmail.com";
	private String pass = "student";

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

	@FindBy(xpath = "//*[contains(text(),'Add to Cart')]")
	private WebElement addToCrat;

	public WebElement getAddToCrat() {
		return addToCrat;
	}

	public void setAddToCrat(WebElement addToCrat) {
		this.addToCrat = addToCrat;
	}

	@FindBy(xpath = "//*[contains(text(),'Catalog')]")
	private WebElement catalogBtn;

	@FindBy(xpath = "//*[contains(text(),'new products')]")
	private WebElement newProductblink;

	// table/tbody/tr/td[2]//strong
	@FindBy(xpath = "//strong//*[contains(text(),'')]")
	private List<WebElement> allProductDisplayinPage;

	@FindBy(xpath = "(//*[contains(@class,'ui-button-text')])[1]")
	private List<WebElement> shoppingCart;

	@FindBy(xpath = "(//strong)[11]")
	private WebElement currentPageNo;
	@FindBy(xpath = "(//strong)[12]")
	private WebElement productCountStartNo;
	@FindBy(xpath = "(//strong)[13]")
	private WebElement productCountEndNo;
	@FindBy(xpath = "(//strong)[14]")
	private WebElement totalproductCount;
	
	@FindBy(xpath = "(//strong)[1]")
	private List<WebElement> cartProduct;
	
	@FindBy(xpath = "//*[@name='cart_quantity[]']")
	private List<WebElement> productNoInsideCart;
	
	@FindBy(xpath = "//*[contains(text(),'Update')]")
	private List<WebElement> updateBtn;
	
	@FindBy(xpath = "(//strong)[3]")
	private List<WebElement> priceofProduct;
	
	@FindBy(xpath = "(//*[contains(text(),'Checkout')])[2]")
	private List<WebElement> checkOutBtn;
	
	@FindBy(xpath = "(//*[@class='ui-widget-content infoBoxContents'])[1]")
	private List<WebElement> shippindAddreddBox;
	
	@FindBy(xpath = "(//*[@class='contentText'])[3]")
	private List<WebElement> shippingMethods;
	
	@FindBy(xpath = "(//*[@class='contentText'])[4]/*")
	private List<WebElement> addCommentBox;
	
	@FindBy(xpath = "//*[contains(text(),'Continue')]")
	private List<WebElement> coninueBtn;
	@FindBy(xpath = "(//*[@class='contentText'])[3]//td[1]")
	private List<WebElement> allPayementOptions;
	@FindBy(xpath = "(//*[@class='contentText'])[3]//td[2]")
	private List<WebElement> selectPaymentOptions;
	@FindBy(xpath = "(//tbody)[6]")
	private List<WebElement> finalCost;
	@FindBy(xpath = "//*[contains(text(),'Confirm Order')]")
	private List<WebElement> confirmedOrderbtn;
	@FindBy(xpath = "//*[contains(text(),' Processed!')]")
	private List<WebElement> validateOrderText;
	@FindBy(xpath = "//*[contains(@class,'pageResults')]")
	private List<WebElement> allPageNo;
	
	

	
	
	public List<WebElement> getCartProduct() {
		return cartProduct;
	}

	public List<WebElement> getProductNoInsideCart() {
		return productNoInsideCart;
	}

	public List<WebElement> getUpdateBtn() {
		return updateBtn;
	}

	public List<WebElement> getPriceofProduct() {
		return priceofProduct;
	}

	public List<WebElement> getCheckOutBtn() {
		return checkOutBtn;
	}

	public List<WebElement> getShippindAddreddBox() {
		return shippindAddreddBox;
	}

	public List<WebElement> getShippingMethods() {
		return shippingMethods;
	}

	public List<WebElement> getAddCommentBox() {
		return addCommentBox;
	}

	public List<WebElement> getConinueBtn() {
		return coninueBtn;
	}

	public List<WebElement> getAllPayementOptions() {
		return allPayementOptions;
	}

	public List<WebElement> getSelectPaymentOptions() {
		return selectPaymentOptions;
	}

	public List<WebElement> getFinalCost() {
		return finalCost;
	}

	public List<WebElement> getConfirmedOrderbtn() {
		return confirmedOrderbtn;
	}

	public List<WebElement> getValidateOrderText() {
		return validateOrderText;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCatalogBtn() {
		return catalogBtn;
	}

	public WebElement getNewProductblink() {
		return newProductblink;
	}

	public WebElement getCurrentPageNo() {
		return currentPageNo;
	}

	public WebElement getProductCountStartNo() {
		return productCountStartNo;
	}

	public WebElement getProductCountEndNo() {
		return productCountEndNo;
	}

	public WebElement getTotalproductCount() {
		return totalproductCount;
	}

	public List<WebElement> getAllPageNo() {
		return allPageNo;
	}

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

	public List<WebElement> getAllProductDisplayinPage() {
		return allProductDisplayinPage;
	}

	public List<WebElement> getShoppingCart() {
		return shoppingCart;
	}

}
