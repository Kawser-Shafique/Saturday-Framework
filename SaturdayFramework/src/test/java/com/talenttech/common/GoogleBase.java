package com.talenttech.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleBase {

	WebDriver driver;
	String browser ="Chrome";
	public String url = "http://www.google.com";
	
	public WebDriver getDriver () {
		
		if (browser == "chrome") {
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser == "firefox") {
			driver = new FirefoxDriver();
			
		}
		else if (browser == "IE") {
			
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
		}
}
