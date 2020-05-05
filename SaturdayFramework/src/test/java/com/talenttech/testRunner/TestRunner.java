package com.talenttech.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = {"Features"},
		glue = {"com.talenttech.steps"},
		tags = {"@googlesearch"}
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

	
	
}
