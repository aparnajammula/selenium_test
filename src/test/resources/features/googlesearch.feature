@GoogleSearch
Feature: As a user I should be able to search using google



  @ready
  Scenario: User searches on google
    Given user is on google landing page
    Then  Enter search query
    And   Verify if results are displayed