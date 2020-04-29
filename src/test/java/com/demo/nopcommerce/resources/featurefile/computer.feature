Feature: Computer page functionality
  As a user I want to visit computer page on nop commerce website

  Scenario: Verify user should navigate to computer page
    Given I am on nop commerce Home Page
    When I click on computer feature
    Then I should be on computer page successfully

  Scenario: Verify user should add product to cart successfully
    Given I am on nop commerce Home Page
    And I click on computer feature
    And I click on desktop feature
    And I click on position field
    And I sort item by A to Z button
    When I click on build computer button
    And I click on radio button
    And I click on add to cart button
    Then I should see product added successful message
