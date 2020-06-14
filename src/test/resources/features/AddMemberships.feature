#Author: Andrei Shelekhov andreishelekhov@yahoo.com
Feature: Adding Memberships

  Scenario: As Admin i want to add memberships
    Given I logged in application
    And I navigated to the Memberships page
    When I click on Add button
    And I enter the name of membership and click on Save button
      | Philadelphia Eagles Fans |
      | San Francisco 49ers Fans |
      | Las Vegas Raiders Fans   |
    Then I see all kind of memeberships successfully added
