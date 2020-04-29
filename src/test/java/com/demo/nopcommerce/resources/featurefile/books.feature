Feature: Books Functionality
  As a user I want to visit nop commerce website to buy books


  Scenario: Verify user should navigate to books page successfully
    Given I am on nop commerce Home Page
    When I click on Books feature
    Then I should be in Books page successfully

  Scenario: Verify user should find books in ascending order A to Z
    Given I am on nop commerce Home Page
    And I click on Books feature
    When I click on sort by position button
    And I select Name A to Z
    Then I should see below books displayed in A to Z order

  Scenario: Verify user should find books price in Low To High order
    Given I am on nop commerce Home Page
    And I click on Books feature
    When I click on sort by position button
    And I select Price Low to High
    Then I should see below books displayed in Low to High order