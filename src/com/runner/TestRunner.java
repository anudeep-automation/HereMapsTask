package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = {"com.stepdefinition" }, 
				dryRun = false, monochrome = true, 
				plugin  = { "pretty", "html:../Here.com/Reports" })

public class TestRunner 
{
	
}