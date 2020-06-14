$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddMemberships.feature");
formatter.feature({
  "name": "Adding Memberships",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As Admin i want to add memberships",
  "description": "",
  "keyword": "Scenario"
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
  "name": "I navigated to the Memberships page",
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsSteps.i_navigated_to_the_Memberships_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsSteps.i_click_on_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the name of membership and click on Save button",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsSteps.i_enter_the_name_of_membership_and_click_on_Save_button(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see all kind of memeberships successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "com.goat.steps.AddMembershipsSteps.i_see_all_kind_of_memeberships_successfully_added()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "As Admin i want to add memberships");
formatter.after({
  "status": "passed"
});
});