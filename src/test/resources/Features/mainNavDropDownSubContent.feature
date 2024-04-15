Feature: Lumapage

  Scenario: Verify that main navigation dropdown links have the correct subcontent

    Given I am on the luma page
    When I hover on the dropdown elements on the luma page
    And I should see all the correct main dropdown content
    And I hover on the main dropdown content
    Then I should see all the correct subcontent
