$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("admin.feature");
formatter.feature({
  "line": 3,
  "name": "check the system user details",
  "description": "",
  "id": "check-the-system-user-details",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@admin"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "check the user details with valid credentials and Invalid credentials",
  "description": "",
  "id": "check-the-system-user-details;check-the-user-details-with-valid-credentials-and-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"\u003cusernameNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able to login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "admin is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter valid username",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "clicking the Search button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user details displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "check-the-system-user-details;check-the-user-details-with-valid-credentials-and-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "usernameNumber"
      ],
      "line": 15,
      "id": "check-the-system-user-details;check-the-user-details-with-valid-credentials-and-invalid-credentials;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 16,
      "id": "check-the-system-user-details;check-the-user-details-with-valid-credentials-and-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "check the user details with valid credentials and Invalid credentials",
  "description": "",
  "id": "check-the-system-user-details;check-the-user-details-with-valid-credentials-and-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@admin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able to login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "admin is clicked",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter valid username",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "clicking the Search button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user details displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangehrmTest.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 8900806363,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "OrangehrmTest.i_enter_valid_and_valid(String)"
});
formatter.result({
  "duration": 190672911,
  "status": "passed"
});
formatter.match({
  "location": "OrangehrmTest.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 4025530917,
  "status": "passed"
});
formatter.match({
  "location": "OrangehrmTest.admin_is_clicked()"
});
formatter.result({
  "duration": 2233391330,
  "status": "passed"
});
formatter.match({
  "location": "OrangehrmTest.i_enter_valid_username()"
});
formatter.result({
  "duration": 476410228,
  "status": "passed"
});
formatter.match({
  "location": "OrangehrmTest.clicking_the_Search_button()"
});
formatter.result({
  "duration": 867466308,
  "status": "passed"
});
formatter.match({
  "location": "OrangehrmTest.user_details_displayed()"
});
formatter.result({
  "duration": 5846369707,
  "status": "passed"
});
});