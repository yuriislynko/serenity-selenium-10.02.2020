Search

Meta:
@search
@smoke

Narrative:
  In order to find content in application
  As a regular user
  I want to be able to search by search term

Lifecycle:
Before:
Scope: SCENARIO
Given I open Landing page
When I login with username michael.orekh@gmail.com and password Or.ru1999

Scenario: Searching by search term
Given I should see Home page
When I search for hr
Then I should see hr in each result