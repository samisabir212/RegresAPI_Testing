$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature webservice",
  "description": "\n\nas a user i want to login so i can access the application\ntherefor when a user logs in the user should get an access token.",
  "id": "login-feature-webservice",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "",
  "description": "\nUser should get an access token after loggining in",
  "id": "login-feature-webservice;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "execute login webservice and login successfully \"\u003cTestname\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "login-feature-webservice;;",
  "rows": [
    {
      "cells": [
        "Testname"
      ],
      "line": 17,
      "id": "login-feature-webservice;;;1"
    },
    {
      "cells": [
        "SuccessfulLogin"
      ],
      "line": 18,
      "id": "login-feature-webservice;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "",
  "description": "\nUser should get an access token after loggining in",
  "id": "login-feature-webservice;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "execute login webservice and login successfully \"SuccessfulLogin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SuccessfulLogin",
      "offset": 49
    }
  ],
  "location": "LoginSteps.execute_login_webservice_and_login_successfully(String)"
});
formatter.result({
  "duration": 1932716502,
  "status": "passed"
});
});