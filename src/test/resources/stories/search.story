Search

Meta:
@search
@smoke

Narrative:
  In order to find needed information
  As a regular user
  I want to be able to search for items containing certain words

Lifecycle:
Before:
Scope: SCENARIO
Given Home page is already opened

Scenario: Searching for certain words
When I enter a searchTerm into search field and press "Enter"
Then I should see search results which contain searchTerm