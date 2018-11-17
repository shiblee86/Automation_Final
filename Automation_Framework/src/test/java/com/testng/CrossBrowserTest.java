package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
	@Test
	@Parameters("browser") 
	public void getbrowser() throws Exception{
		String a="FireFox";
		String b="Chrome";
		String c= "ie";
	if(a.equalsIgnoreCase("FireFox")){
			System.setProperty("webdriver.Gheko.driver", "./Driver/ghekodriver.exe");
			driver = new FirefoxDriver();
			//your code
			}	
	if(b.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver = new ChromeDriver();
				//your code
				}
	if (c.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			//your code
			}
	}
		
	}

