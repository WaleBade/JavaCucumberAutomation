Feature: Login

  Scenario: Verify that user can login to the Luma app with valid credentials

    Given I am on the luma landing screen
    When I click on the sign in link
    And I enter correct username
    And I enter correct password
    When I clcik the login button
    Then I should be logged in successfully

