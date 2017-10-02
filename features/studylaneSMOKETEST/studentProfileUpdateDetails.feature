Feature: My Profile

Scenario: A student wants to update his details
Given I am in studylane homepage
#myApplicationsPage
When I edit the details in my profile
#profileDetails
And I click on the submit button
Then The details I added should reflect in My Profile