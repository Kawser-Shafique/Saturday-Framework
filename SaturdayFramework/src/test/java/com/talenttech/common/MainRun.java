package com.talenttech.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainRun {
	
	
	WebDriver driver;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	
	}

}
