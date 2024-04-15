Feature: Luma home Page

  Scenario: Verify that main navigation dropdown links have the correct content

    Given I am on the luma landing page
    When I hover on the dropdown elements on the landing page
    Then I should see all the correct dropdown content
