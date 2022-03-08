Feature: Customers

Background: Below are the common steps for each scenario
		Given User open application 
  	When User enters Email as "admin@yourstore.com" and Password as "admin"
		And Click on Login
		Then User can view Dashboard
		
Scenario: Add new Customer
		When User click on Customers Menu
		And click on Customers Menu Item
		And click on Add new button
		Then User can view Add new Customer page
		When User enter customer info
		And Click on Save button
		Then User can view Confirmation message "The new customer has been added successfully"
		And close browser
		
Scenario: Search Customer by EmailID
		When User click on Customers Menu
		And click on Customers Menu Item
		And Enter Customer Email
		When Click on search Button
		Then User should find Email in the Search Table
		And close browser
			
Scenario: Search Customer by Name
		When User click on Customers Menu
		And click on Customers Menu Item
		And Enter customer FirstName
		And Enter customer LastName
		When Click on search Button
		Then User should find Name in the Search Table
		And close browser