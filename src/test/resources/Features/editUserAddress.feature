Feature: Edit User Address

  Scenario: Verify that user can edit address

    Given I already logged in
    When I enter details for changing address
    And I clicked on the save button
    Then My address should be edited successfully