Feature: Student Profile

Scenario: A student wants to view his profile 
Given I am in studylane homepage
#homepageURL
When I clicked my profile from the menu
Then I should be redirected to studylane student profile page
#studentProfileURL
And The following details should be displayed
#profileDetails