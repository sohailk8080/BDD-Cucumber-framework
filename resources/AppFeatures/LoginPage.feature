Feature: Login page feature

Scenario: Login page title
	Given User is on login page
	When User gets title of the page
	Then Page title should be "Login - My Store"
	
Scenario: Forgot Password Link
	Given User is on login page
	Then Forgot password link should be displayed	

Scenario: Login with correct Credentials
	Given User is on login page
	When user enters username "dec2020secondbatch@gmail.com"
	And User enters password "Selenium@12345"
	And User click on login button
	Then User gets title of the page
	And Page title should be "My account - My Store"
	