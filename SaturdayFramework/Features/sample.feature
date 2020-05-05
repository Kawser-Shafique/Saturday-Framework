Feature: Sample Feature

Scenario: Add a friend

Given I am on facebook homepage
When I search by name
And I click on Add a friend button
Then I see a friend request sent sucessfully massage
