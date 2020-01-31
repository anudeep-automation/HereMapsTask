Feature: Validate all links on the documentation page 

Scenario Outline:
Validate all links on the page for a provided URL
	Given Launch Browser 
	When  Switch to URL "<URL>" 
	Then  Fetch Links 
	Then  Close the Session 
	
	Examples: 
		|URL|
		|https://developer.here.com/documentation|