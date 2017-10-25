Feature: Login

Scenario: An admin wants to login in GSP 
Given I visit the login page of GSP
And The header text displays Account Login
When I input my credentials
And I click on the Login button
Then I should be redirected to Partners Applications List