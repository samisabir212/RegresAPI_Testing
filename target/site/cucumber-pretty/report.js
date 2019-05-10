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
  "name": "execute login service for negative testcases \"\u003cTestname\u003e\" \"\u003cexpectedErrorMessage\u003e\"",
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
        "Testname",
        "expectedErrorMessage"
      ],
      "line": 14,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;1"
    },
    {
      "cells": [
        "InvalidEmail",
        "user not found"
      ],
      "line": 15,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;2"
    },
    {
      "cells": [
        "InvalidPassword",
        "invalid password"
      ],
      "line": 16,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;3"
    },
    {
      "cells": [
        "BlankEmail",
        "Missing email or username"
      ],
      "line": 17,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;4"
    },
    {
      "cells": [
        "BlankPassword",
        "Missing password"
      ],
      "line": 18,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;5"
    },
    {
      "cells": [
        "NoEmail",
        "Missing email or username"
      ],
      "line": 19,
      "id": "login-feature-for-reqres.in;negative-testcases-for-login-feature;;6"
    },
    {
      "cells": [
        "NoPassword",
        "user not found"
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
  "name": "execute login service for negative testcases \"InvalidEmail\" \"user not found\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "InvalidEmail",
      "offset": 46
    },
    {
      "val": "user not found",
      "offset": 61
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String,String)"
});
formatter.result({
  "duration": 4315600900,
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
  "name": "execute login service for negative testcases \"InvalidPassword\" \"invalid password\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "InvalidPassword",
      "offset": 46
    },
    {
      "val": "invalid password",
      "offset": 64
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String,String)"
});
formatter.result({
  "duration": 277432596,
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
  "name": "execute login service for negative testcases \"BlankEmail\" \"Missing email or username\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "BlankEmail",
      "offset": 46
    },
    {
      "val": "Missing email or username",
      "offset": 59
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String,String)"
});
formatter.result({
  "duration": 344179049,
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
  "name": "execute login service for negative testcases \"BlankPassword\" \"Missing password\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "BlankPassword",
      "offset": 46
    },
    {
      "val": "Missing password",
      "offset": 62
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String,String)"
});
formatter.result({
  "duration": 341841915,
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
  "name": "execute login service for negative testcases \"NoEmail\" \"Missing email or username\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "NoEmail",
      "offset": 46
    },
    {
      "val": "Missing email or username",
      "offset": 56
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String,String)"
});
formatter.result({
  "duration": 343790204,
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
  "name": "execute login service for negative testcases \"NoPassword\" \"user not found\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "NoPassword",
      "offset": 46
    },
    {
      "val": "user not found",
      "offset": 59
    }
  ],
  "location": "LoginSteps.execute_login_service_for_negative_testcases(String,String)"
});
formatter.result({
  "duration": 244719366,
  "status": "passed"
});
});