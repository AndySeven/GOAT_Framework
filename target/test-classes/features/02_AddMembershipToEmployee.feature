#Author: Andrei Shelekehov andreishelekhov@yahoo.com
Feature: Adding memberships to employee
	@Test @GroupMemberships
  Scenario Outline: As Admin i wand to add memberships to any employee
    Given I logged in application
    And I navigated to Add Employee page
    And I added new employees "<First Name>" and "<Last Name>"
    And I navigated on Assigned Memberships page
    When I click Add button
    And I select Membership "<Membership>"
    And I select Subscription Paid By option "<Subscription Option>"
    And I enter Amount "<Amount>"
    And I select "<Currency>"
    And I select Subscription Commence Date "<Subscription Commence>"
    And I select Subscription Renewal Date "<Subscription Renewal>"
    And I click on Save button
    Then I see membership "<Membership>" successfully added to employee

    Examples: 
      | First Name | Last Name  | Membership               | Subscription Option | Amount | Currency    | Subscription Commence | Subscription Renewal |
      | Fletcher   | Cox        | Philadelphia Eagles Fans | Company             |   1000 | Swiss Franc | 2000-May-09           | 2019-Feb-24          |
      | Colin      | Kaepernick | San Francisco 49ers Fans | Individual          |    900 | Swiss Franc | 2010-Aug-26           | 2012-Dec-03          |
      | Ice        | Cube       | Las Vegas Raiders Fans   | Individual          |    400 | Swiss Franc | 1984-Mar-12           | 2018-Apr-04          |
