Feature: studylane Health Check

Scenario: All SL connection should be healthy

Given I am on the studylane healthcheck url 
#studylanehealthCheckURL
When I check the values in the page 
#healthCheckStatus - value
Then The values should be one