package com.talenttech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {

	WebDriver driver;
	//Constructor 
	public GoogleHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(name="q")
	WebElement searchBox;
	
	public WebElement searchEditBox() {
		
		return searchBox;
		
	}
	
	@FindBy (xpath = "//input[@name='btnK']")
	WebElement googleButton;
	
	public WebElement googleButton() {
		return googleButton;
		
	}
}
