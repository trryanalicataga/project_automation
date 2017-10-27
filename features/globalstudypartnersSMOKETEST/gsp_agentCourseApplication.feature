Feature: Course Application

Scenario: I should be able to apply a student to a course with no course applications

Given  I am in the homepage of GSP
#gspHomepage
When I enter a keyword in the searchfield 
#keyword
And I click the search button
And I should be forwarded to the course results page with courses related to the keywords I entered
And I click apply on the bookmarked section
And I input my student's email in the Student Contact Details
And The form prompts me to reload all the fields with my student's details 
#accordionSection
And I fill in the remaining required fields
And I click submit button
Then The student should be applied to the course
And I and the student should receive an email about the application