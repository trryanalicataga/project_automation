Feature: Account Dashboard

Scenario: An admin approves an agent application to be a certified agent
Given I visit the login page of GSP
And The agent is listed as  Conditionally Approved
And I click on the Approve button 
And I click on the OK button of the prompt
And I click on the QA Verified - Yes radio button on the following tabs
When I click on the Approve button in the QA verified page
Then The status of the applicant should be changed to approve