Feature: Student Application

Scenario: A student wants to view his application status 
Given I am in studylane homepage
#studentAccountDashboard
When I clicked My Applications from the menu
Then I should be redirected my My Applications page
#myApplicationsPage