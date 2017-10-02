Feature: Application History

Scenario: A student wants to view his application history
Given I am in studylane homepage
#studentAccountDashboard
When I clicked My Applications from the menu
Then I should be redirected my My Applications page
#myApplicationsPage
When I click status history from the application card
Then I should be shown a bubble with the history of the application
#statusHistoryDetails