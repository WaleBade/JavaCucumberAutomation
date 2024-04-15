Feature: Invalid Login

  Scenario Outline: Verify that user can not login with invalid credentials

    Given I am on the luma application page
    When I click on the signin link
    And I enter the user "<username>"
    And I enter thepass "<password>"
    When I click on the login button
    Then I should get "<errorMessage>"

    Examples:
      |username                                   |password                   |errorMessage                                                                                                |
      |olabisibalqees@yahoo.com                   |Testing2024                |The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later. |
      |olabisibalqee@yahoo.com                    |Testing2023                |The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later. |
      |olabisibalqes@yahoo.com                    |Testing2025                |The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later. |