$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/02_AddMembershipToEmployee.feature");
formatter.feature({
  "name": "Adding memberships to employee",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "As Admin i wand to add memberships to any employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@GroupMemberships"
    }
  ]
});
formatter.step({
  "name": "I logged in application",
  "keyword": "Given "
});
formatter.step({
  "name": "I navigated to Add Employee page",
  "keyword": "And "
});
formatter.step({
  "name": "I added new employees \"\u003cFirst Name\u003e\" and \"\u003cLast Name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I navigated on Assigned Memberships page",
  "keyword": "And "
});
formatter.step({
  "name": "I click Add button",
  "keyword": "When "
});
formatter.step({
  "name": "I select Membership \"\u003cMembership\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select Subscription Paid By option \"\u003cSubscription Option\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter Amount \"\u003cAmount\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select \"\u003cCurrency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select Subscription Commence Date \"\u003cSubscription Commence\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select Subscription Renewal Date \"\u003cSubscription Renewal\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "name": "I see membership \"\u003cMembership\u003e\" successfully added to employee",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Membership",
        "Subscription Option",
        "Amount",
        "Currency",
        "Subscription Commence",
        "Subscription Renewal"
      ]
    },
    {
      "cells": [
        "Fletcher",
        "Cox",
        "Philadelphia Eagles Fans",
        "Company",
        "1000",
        "Swiss Franc",
        "2000-May-09",
        "2019-Feb-24"
      ]
    },
    {
      "cells": [
        "Colin",
        "Kaepernick",
        "San Francisco 49ers Fans",
        "Individual",
        "900",
        "Swiss Franc",
        "2010-Aug-26",
        "2012-Dec-03"
      ]
    },
    {
      "cells": [
        "Ice",
        "Cube",
        "Las Vegas Raiders Fans",
        "Individual",
        "400",
        "Swiss Franc",
        "1984-Mar-12",
        "2018-Apr-04"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As Admin i wand to add memberships to any employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@GroupMemberships"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsSteps.i_logged_in_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to Add Employee page",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_navigated_to_Add_Employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I added new employees \"Fletcher\" and \"Cox\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_added_new_employees_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated on Assigned Memberships page",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_navigated_on_Assigned_Memberships_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_click_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Membership \"Philadelphia Eagles Fans\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Membership(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Subscription Paid By option \"Company\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Subscription_Paid_By_option_Company(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Amount \"1000\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_enter_Amount(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Swiss Franc\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Subscription Commence Date \"2000-May-09\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Subscription_Commence_Date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Subscription Renewal Date \"2019-Feb-24\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Subscription_Renewal_Date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see membership \"Philadelphia Eagles Fans\" successfully added to employee",
  "keyword": "Then "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_see_membership_successfully_added_to_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "As Admin i wand to add memberships to any employee");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As Admin i wand to add memberships to any employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@GroupMemberships"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsSteps.i_logged_in_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to Add Employee page",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_navigated_to_Add_Employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I added new employees \"Colin\" and \"Kaepernick\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_added_new_employees_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated on Assigned Memberships page",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_navigated_on_Assigned_Memberships_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_click_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Membership \"San Francisco 49ers Fans\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Membership(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Subscription Paid By option \"Individual\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Subscription_Paid_By_option_Company(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Amount \"900\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_enter_Amount(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Swiss Franc\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Subscription Commence Date \"2010-Aug-26\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Subscription_Commence_Date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Subscription Renewal Date \"2012-Dec-03\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Subscription_Renewal_Date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see membership \"San Francisco 49ers Fans\" successfully added to employee",
  "keyword": "Then "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_see_membership_successfully_added_to_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "As Admin i wand to add memberships to any employee");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As Admin i wand to add memberships to any employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@GroupMemberships"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsSteps.i_logged_in_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to Add Employee page",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_navigated_to_Add_Employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I added new employees \"Ice\" and \"Cube\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_added_new_employees_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated on Assigned Memberships page",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_navigated_on_Assigned_Memberships_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_click_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Membership \"Las Vegas Raiders Fans\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Membership(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Subscription Paid By option \"Individual\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Subscription_Paid_By_option_Company(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Amount \"400\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_enter_Amount(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Swiss Franc\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Subscription Commence Date \"1984-Mar-12\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Subscription_Commence_Date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Subscription Renewal Date \"2018-Apr-04\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_select_Subscription_Renewal_Date(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see membership \"Las Vegas Raiders Fans\" successfully added to employee",
  "keyword": "Then "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsToEmployee.i_see_membership_successfully_added_to_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "As Admin i wand to add memberships to any employee");
formatter.after({
  "status": "passed"
});
});