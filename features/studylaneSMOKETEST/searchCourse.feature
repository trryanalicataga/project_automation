
Feature: Search

Scenario: Anyone should be able to search for courses
Given I am in studylane homepage
#homepage
When I enter a keyword in the enter search textbox
#keyword
And click search
Then I should be forwarded to the search results with courses related to the fields I entered
#coursesearchURL