$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login/NegativeTestCases.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature for reqres.in",
  "description": "\nUser should not be able to login with invalid credentials",
  "id": "login-feature-for-reqres.in",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Negative testCases For Login Feature",
  "description": "",
  "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "execute login service for negative testcases \"\u003cTestname\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;",
  "rows": [
    {
      "cells": [
        "Testname"
      ],
      "line": 14,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;1"
    },
    {
      "cells": [
        "InvalidEmail"
      ],
      "line": 15,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;2"
    },
    {
      "cells": [
        "InvalidPassword"
      ],
      "line": 16,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;3"
    },
    {
      "cells": [
        "BlankEmail"
      ],
      "line": 17,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;4"
    },
    {
      "cells": [
        "BlankPassword"
      ],
      "line": 18,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;5"
    },
    {
      "cells": [
        "NoEmail"
      ],
      "line": 19,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;6"
    },
    {
      "cells": [
        "NoPassword"
      ],
      "line": 20,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Negative testCases For Login Feature",
  "description": "",
  "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "execute login service for negative testcases \"InvalidEmail\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "InvalidEmail",
      "offset": 46
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String)"
});
formatter.result({
  "duration": 1847774949,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Negative testCases For Login Feature",
  "description": "",
  "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "execute login service for negative testcases \"InvalidPassword\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "InvalidPassword",
      "offset": 46
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String)"
});
formatter.result({
  "duration": 332910549,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Negative testCases For Login Feature",
  "description": "",
  "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "execute login service for negative testcases \"BlankEmail\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "BlankEmail",
      "offset": 46
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String)"
});
formatter.result({
  "duration": 760171505,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Negative testCases For Login Feature",
  "description": "",
  "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "execute login service for negative testcases \"BlankPassword\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "BlankPassword",
      "offset": 46
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String)"
});
formatter.result({
  "duration": 273271007,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Negative testCases For Login Feature",
  "description": "",
  "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "execute login service for negative testcases \"NoEmail\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "NoEmail",
      "offset": 46
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String)"
});
formatter.result({
  "duration": 241934650,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Negative testCases For Login Feature",
  "description": "",
  "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "execute login service for negative testcases \"NoPassword\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "NoPassword",
      "offset": 46
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String)"
});
formatter.result({
  "duration": 322436732,
  "status": "passed"
});
});