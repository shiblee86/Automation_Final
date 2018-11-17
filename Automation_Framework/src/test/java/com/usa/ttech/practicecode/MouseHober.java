package com.usa.ttech.practicecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHober {
	static WebDriver driver ;
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		 driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");

		WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]"));
		
		Thread.sleep(2500);
		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		driver.findElement(By.xpath(".//*[@id='nav-al-wishlist']/a[3]/span")).click();

	}

}
