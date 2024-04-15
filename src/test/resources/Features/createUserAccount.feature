Feature: Create User Account

  Scenario: Verify that user can create account

    Given I get on the homepage
    When I click the link to create account
    And I entered all the required information
    When I click the create account button
    Then My account should be creted successfully

