Feature: Home page validation
	As a user
	I want to validate that all key elements on the home page are displayed correctly
	So that I can ensure that website is funtioning as expected
	
	Scenario: Validate header, footer, and product listings on the home page
		Given I am on the home page
		Then the header should be displayed
		And the footer should be displayed
		
		