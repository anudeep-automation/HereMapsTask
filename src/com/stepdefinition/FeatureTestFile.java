package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import com.page.objects.DocPage;

public class FeatureTestFile extends DocPage {

	String pageTitle;
	
	@Given("^Launch Browser$")
	public void launch_browser()  
	{
	   init();
	}

	@When("^Switch to URL \"([^\"]*)\"$")
	public void navigate_to_url(String URL)
	{
		pageTitle = launchURL(URL);
		Assert.assertEquals("Documentation, Code Examples and API References - HERE Developer", pageTitle);
	}

	@Then("^Fetch Links$")
	public void fetch_all_links()
	{	
		validateLinks("//div[contains(@class,'documentation-link-group')]//*[@href and @target='_self']");
		validateLinks("//div[@class='cta cta--inline cta--developer cta__content']");
	}
	
	@Then("^Close the Session$")
    public void close_browser()  
	{
        driver.close();
    }

	

}