Feature: Login

Scenario: Agent should be a certified master agent in GSP 
Given I am in GSP homepage 
And I click on the Login button in the header
And A login modal displays
And I input my credentials
When I click Login button
Then I should be redirected to the Manage Students page
And The following tabs should display 