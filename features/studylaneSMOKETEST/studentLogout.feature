Feature: Landing Page - Logout

Scenario: I should be able to logout my account
Given I am in studylane homepage
When I click the logout link in the header
Then I should be logged out of studylane
And I should not be able to access the my account page