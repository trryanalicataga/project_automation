Feature: Search

Scenario: I should be able to search courses
Given  I am in the homepage of GSP
#gspHomepage
When I enter a keyword in the searchfield 
#keyword
And I click the search button
Then I should be forwarded to the course results page with courses related to the keywords I entered
#courseSearchURL