Feature: Course Application

Scenario: A student wants to apply to a course
Given I am in the studylane homepage
#courseResultsURL
When I enter a keyword in the enter search textbox
And I am redirected to an agent selection page
#agentSelectionURL
And I have selected an agent
And I am redirected to the course application page
And I fill-in all the required fields in the form accordions
#formAccordions
And I have uploaded my documents
And I click the Submit button
Then The course should be applied
And An account should be created for me
And My uploaded documents should display in my profile
And I should receive an email to set up a new password