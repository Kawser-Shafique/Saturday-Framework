package com.talenttech.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.talenttech.pages.GoogleHome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch {

	WebDriver driver; // webdriver is a interface
	GoogleHome gh; //= new GoogleHome (driver);
	
	@Given("^I am on google homepage$")
	public void i_am_on_google_homepage() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.getTitle();
		String pageTitle=driver.getTitle();
		
		System.out.println(pageTitle);
		
		if (driver.getTitle().equals("Google")) {
			
			System.out.println("My Google First page Validation Pass ");
			
			
	}
		else 
			System.out.println("My Google First page Validation Fail");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//driver.findElement(By.name("q")).sendKeys("Quality Assurance");
		
	}

	@When("^I enter search term \"([^\"]*)\"$")
	public void i_enter_search_term(String arg1) throws Throwable {
		
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		//driver.findElement(By.name("q")).sendKeys("Quality Assuarance");
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		gh = PageFactory.initElements(driver,GoogleHome.class);
		gh.searchEditBox().sendKeys("Quality Assurance");
	}

	
	
	@When("^I click on Search button$")
	public void i_click_on_Search_button() throws Throwable {
		
		gh.googleButton().click();
		
		
	}

	@Then("^I find relative search contents on google$")
	public void i_find_relative_search_contents_on_google() throws Throwable {
	}
	
	
}
