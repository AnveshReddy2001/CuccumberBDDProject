Feature: Login to E-commerce website
	As a user 
	I want to login to the E-commerce website 
	So that I can access my account
	
	Scenario: Successful login with valid credentials
		Given I am on the login page
		When I enter valid credentials
		And I click the login button
		Then I should be redirected to the account dashboard