$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/Features/problem.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Objectives",
  "description": "",
  "id": "verify-the-objectives",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successfull verification of the Objectives",
  "description": "",
  "id": "verify-the-objectives;successfull-verification-of-the-objectives",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launches the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify the count of values appear on the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify the values on the screen are greater than zero",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify all values are formatted as currencies",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify the Total Balance matches the sum of all the values",
  "keyword": "Then "
});
formatter.match({
  "location": "problemStepDefinition.user_launches_the_browser()"
});
formatter.result({
  "duration": 18381202400,
  "status": "passed"
});
formatter.match({
  "location": "problemStepDefinition.verify_the_count_of_values_appear_on_the_screen()"
});
formatter.result({
  "duration": 149695800,
  "status": "passed"
});
formatter.match({
  "location": "problemStepDefinition.verify_the_values_on_the_screen_are_greater_than_zero()"
});
formatter.result({
  "duration": 111100,
  "status": "passed"
});
formatter.match({
  "location": "problemStepDefinition.verify_all_values_are_formatted_as_currencies()"
});
formatter.result({
  "duration": 122800,
  "status": "passed"
});
formatter.match({
  "location": "problemStepDefinition.verify_the_Total_Balance_matches_the_sum_of_all_the_values()"
});
formatter.result({
  "duration": 4257900,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003c1000000.0\u003e but was:\u003c887000.0\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:329)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:78)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:86)\r\n\tat com.qa.StepDefinitions.problemStepDefinition.verify_the_Total_Balance_matches_the_sum_of_all_the_values(problemStepDefinition.java:50)\r\n\tat ✽.Then verify the Total Balance matches the sum of all the values(src/main/java/com/qa/Features/problem.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 912943500,
  "status": "passed"
});
});