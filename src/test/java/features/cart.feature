Feature: Cart funtionality
	As a user
	I want to add and remove products in the cart
	So that I can manage my shopping cart on the e-commerce website
	
	Scenario: Add a product to the cart
		Given I am on the home page
		When I add a product to the cart
		Then the product should be added to the cart
		
	Scenario: Remove a product from the cart
		
		When I remove the product from the cart
		Then the cart should be empty