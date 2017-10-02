Feature: Sign Up

Scenario: A visitor should be able to sign up in studylane

Given I am in studylane sign up page
#SignupURL
And I filled out all the required 
And Validations for each field should display if left blank
#fields - validations
When I click Create Account button
Then I should be redirected to studylane login page 
#LoginURL
And I should be able to login