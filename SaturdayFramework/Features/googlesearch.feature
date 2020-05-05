@googlesearch
Feature: Google search

Scenario: Simple Search 

Given I am on google homepage
When I enter search term "Quality Assurance"
And I click on Search button
Then I find relative search contents on google
