$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateUser/CreateUser.feature");
formatter.feature({
  "line": 1,
  "name": "CreateUser",
  "description": "\nCreateUser service creates a new user in the system",
  "id": "createuser",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "",
  "description": "",
  "id": "createuser;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@CREATEUSER"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "execute create user webservice and validate the user was created successfully \"\u003cTestname\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "createuser;;",
  "rows": [
    {
      "cells": [
        "Testname"
      ],
      "line": 13,
      "id": "createuser;;;1"
    },
    {
      "cells": [
        "SuccessfulCreateUser"
      ],
      "line": 14,
      "id": "createuser;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "",
  "id": "createuser;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@CREATEUSER"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "execute create user webservice and validate the user was created successfully \"SuccessfulCreateUser\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SuccessfulCreateUser",
      "offset": 79
    }
  ],
  "location": "CreateUserSteps.execute_CreateUser_webservice_successfully(String)"
});
formatter.result({
  "duration": 2190152409,
  "status": "passed"
});
});