Feature: Partners Applications List

Scenario: An admin conditionally approves an agent
Given I visit the login page of GSP
And An agent has initially applied
When I click on the Conditionally Approve button
And I include a reason
Then The status of the applicant should be changed to conditionally approved
And I should receive an email regarding the status change
And The agent should receive an email with a Create new password token
And The email should have the following contents