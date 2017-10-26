Feature: Account Dashboard

Scenario: Agent should be able to login after creating a new password and sending his final application requirements
Given I am in my agent account dashboard
And The following elements are displayed
And I complete the remaining missing required documents
When I click on the Send Application button
Then The page should prompt that the team is thoroughly reviewing my application process