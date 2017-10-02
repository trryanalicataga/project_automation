Feature: Student Profile Agent

Scenario: A student wants to view his agent's profile 
Given I am in studylane homepage 
#homepageURL
When I clicked my agent from the menu
Then I should be redirected to studylane agent profile page
#agentProfileURL
And The following details should be displayedz
#profileDetails