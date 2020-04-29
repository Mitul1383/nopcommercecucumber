Feature: Register Functionality
  As a user I want to register on nop commerce website

  Scenario: Verify user should navigate to register page successfully
    Given I am on nop commerce Home Page
    When I click on register feature
    Then I should be on register page successfully

  Scenario: Verify user should register successfully with valid credentials
    Given I am on nop commerce Home Page
    And I click on register feature
    And I select gender
    When I enter user first name "Megh1509"
    And I enter last name "patel"
    And I select day of birth "17"
    And I select date of birth month "September"
    And I select date of birth year "2017"
    And I enter "email"
    And I enter company name "jec  limited"
    And I click on check box of news letter
    And I enter password "patel1346"
    And I enter confirm password "patel1346"
    And I click on register button
    Then I should register successfully


  Scenario Outline: Verify user should not register without last name
    Given I am on nop commerce Home Page
    And I click on register feature
    And I select gender
    When I enter user first name "<firstName>"
    And I enter last name "<lastName>"
    And I select day of birth "<day>"
    And I select date of birth month "<month>"
    And I select date of birth year "<year>"
    And I enter email "<emailId>"
    And I enter company name "<companyName>"
    And I click on check box of news letter
    And I enter password "<password>"
    And I enter confirm password "<confirmPassword>"
    And I click on register button
    Then I should not register successfully "<errorMessage>"
    Examples:
      | firstName     | lastName | day | month  | year | emailId             | companyName          | password      | confirmPassword | errorMessage           |
      | Sachin        |          | 24   | 04    | 1973 | Sachin@gmail.com    | Littelmaster limited | Mumbai!       |   Mumbai!       | Last name is required. |
      | Ganguly       |          | 08   | 07    | 1972 | Ganguly@gmail.com   | Dada limited         | Mumbai3!!     |   Mumbai3!!     | Last name is required. |
      | KumarSanu     |          | 20   | 10    | 1957 | Ksanu@gmail.com     | Sanuda limited       | Mumbai45&&    |   Mumbai45&&    | Last name is required. |
      | KishorKumar   |          | 04   | 08    | 1929 | Kishor@gmail.com    | Kishorda limited     | Mumbai56@@    |   Mumbai56@@    | Last name is required. |
      | LataMangeshkar|          | 28   | 09    | 1929 | Lata@gmail.com      | Lata limited         | Mumbai78***   |   Mumbai78***   | Last name is required. |


