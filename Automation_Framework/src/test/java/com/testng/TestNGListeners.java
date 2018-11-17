package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class TestNGListeners {

	WebDriver driver;

	@Test
	public void Login()

	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Ttech");
		driver.findElement(By.id("pass")).sendKeys("1213wwdeasd");
	
		driver.quit();
	}

	
	@Test
	public void TestToFail() {
		Assert.assertEquals("sarower", "sarower");
	}

}
