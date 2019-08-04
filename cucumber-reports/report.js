$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/Test1.feature");
formatter.feature({
  "line": 1,
  "name": "ELMO QA Test",
  "description": "",
  "id": "elmo-qa-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Test 1 - Scenario-A",
  "description": "",
  "id": "elmo-qa-test;test-1---scenario-a",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ScenarioA"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is already on ELMO Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on Solutions navigation menu",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on HR Core menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify HR Core page url \"\u003cExpectedURL\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify Key Benifits text in the HR Core page \"\u003cKeyBenefits\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Payroll from the dropdown \"\u003cSelectValue\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify Seamless cloud-based payroll and HR solution exists in the page \"\u003cPayrollText\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "elmo-qa-test;test-1---scenario-a;",
  "rows": [
    {
      "cells": [
        "ExpectedURL",
        "KeyBenefits",
        "SelectValue",
        "PayrollText"
      ],
      "line": 14,
      "id": "elmo-qa-test;test-1---scenario-a;;1"
    },
    {
      "cells": [
        "https://elmosoftware.com.au/solutions/core-hr/",
        "Key Benefits",
        "Payroll",
        "Seamless cloud-based payroll and HR solution"
      ],
      "line": 15,
      "id": "elmo-qa-test;test-1---scenario-a;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Test 1 - Scenario-A",
  "description": "",
  "id": "elmo-qa-test;test-1---scenario-a;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@ScenarioA"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is already on ELMO Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on Solutions navigation menu",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on HR Core menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify HR Core page url \"https://elmosoftware.com.au/solutions/core-hr/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify Key Benifits text in the HR Core page \"Key Benefits\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Payroll from the dropdown \"Payroll\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify Seamless cloud-based payroll and HR solution exists in the page \"Seamless cloud-based payroll and HR solution\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Test1_stepDefinition.user_is_already_on_ELMO_Home_page()"
});
formatter.result({
  "duration": 85571490349,
  "status": "passed"
});
formatter.match({
  "location": "Test1_stepDefinition.click_on_Solutions_nagiation_menu()"
});
formatter.result({
  "duration": 7229488583,
  "status": "passed"
});
formatter.match({
  "location": "Test1_stepDefinition.click_on_HR_Core_menu()"
});
formatter.result({
  "duration": 14789251836,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://elmosoftware.com.au/solutions/core-hr/",
      "offset": 25
    }
  ],
  "location": "Test1_stepDefinition.verify_HR_Core_page_url(String)"
});
formatter.result({
  "duration": 4046716382,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Key Benefits",
      "offset": 46
    }
  ],
  "location": "Test1_stepDefinition.verify_Key_Benifits_text_in_the_HR_Core_page(String)"
});
formatter.result({
  "duration": 4258951655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Payroll",
      "offset": 36
    }
  ],
  "location": "Test1_stepDefinition.click_on_Payroll_from_the_dropdown(String)"
});
formatter.result({
  "duration": 15945327184,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Seamless cloud-based payroll and HR solution",
      "offset": 72
    }
  ],
  "location": "Test1_stepDefinition.verify_Seamless_cloud_based_payroll_and_HR_solution_exists_in_the_page(String)"
});
formatter.result({
  "duration": 27055914592,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Test 1 - Scenario-B",
  "description": "",
  "id": "elmo-qa-test;test-1---scenario-b",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@ScenarioB"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is already on ELMO Careers page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Verify Browse Jobs button exists in the careers page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Open Search Jobs url \"\u003cJobsURL\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Enter Software Engineer in search jobs text field \"\u003cSearchJoB\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Select job type as Permanent Full Time",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click on Search button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Verify search returns Back End Software Engineer at Sydney Locations \"\u003cBackEnd\u003e\" and \"\u003cLocation\u003e\" and \"\u003cJobType\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Verify search returns Full Stack Software Engineer at Sydney Locations \"\u003cFullStack\u003e\" and \"\u003cLocation\u003e\" and \"\u003cJobType\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 28,
  "name": "",
  "description": "",
  "id": "elmo-qa-test;test-1---scenario-b;",
  "rows": [
    {
      "cells": [
        "JobsURL",
        "SearchJoB",
        "BackEnd",
        "FullStack",
        "Location",
        "JobType"
      ],
      "line": 29,
      "id": "elmo-qa-test;test-1---scenario-b;;1"
    },
    {
      "cells": [
        "https://elmosoftware.com.au/jobs/",
        "Software Engineer",
        "Back End Software Engineer",
        "Full Stack Software Engineer",
        "Sydney",
        "Permanent - Full Time"
      ],
      "line": 30,
      "id": "elmo-qa-test;test-1---scenario-b;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 30,
  "name": "Test 1 - Scenario-B",
  "description": "",
  "id": "elmo-qa-test;test-1---scenario-b;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@ScenarioB"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is already on ELMO Careers page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Verify Browse Jobs button exists in the careers page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Open Search Jobs url \"https://elmosoftware.com.au/jobs/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Enter Software Engineer in search jobs text field \"Software Engineer\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Select job type as Permanent Full Time",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click on Search button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Verify search returns Back End Software Engineer at Sydney Locations \"Back End Software Engineer\" and \"Sydney\" and \"Permanent - Full Time\"",
  "matchedColumns": [
    2,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Verify search returns Full Stack Software Engineer at Sydney Locations \"Full Stack Software Engineer\" and \"Sydney\" and \"Permanent - Full Time\"",
  "matchedColumns": [
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Test1_stepDefinition.user_is_already_on_ELMO_Careers_page()"
});
formatter.result({
  "duration": 61705148837,
  "status": "passed"
});
formatter.match({
  "location": "Test1_stepDefinition.verify_Browse_Jobs_exists_in_the_careers_page()"
});
formatter.result({
  "duration": 5882289935,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://elmosoftware.com.au/jobs/",
      "offset": 22
    }
  ],
  "location": "Test1_stepDefinition.open_Search_Jobs_url(String)"
});
formatter.result({
  "duration": 18132784711,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Software Engineer",
      "offset": 51
    }
  ],
  "location": "Test1_stepDefinition.enter_Software_Engineer_in_search_jobs_text_field(String)"
});
formatter.result({
  "duration": 15317351133,
  "status": "passed"
});
formatter.match({
  "location": "Test1_stepDefinition.select_job_type_as_Permanent_Full_Time()"
});
formatter.result({
  "duration": 11079049228,
  "status": "passed"
});
formatter.match({
  "location": "Test1_stepDefinition.Click_on_Search_button()"
});
formatter.result({
  "duration": 9299476489,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Back End Software Engineer",
      "offset": 70
    },
    {
      "val": "Sydney",
      "offset": 103
    },
    {
      "val": "Permanent - Full Time",
      "offset": 116
    }
  ],
  "location": "Test1_stepDefinition.verify_search_returns_Back_End_Software_Engineer_at_Sydney_Locations(String,String,String)"
});
formatter.result({
  "duration": 12585604997,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Full Stack Software Engineer",
      "offset": 72
    },
    {
      "val": "Sydney",
      "offset": 107
    },
    {
      "val": "Permanent - Full Time",
      "offset": 120
    }
  ],
  "location": "Test1_stepDefinition.verify_search_returns_Full_Stack_Software_Engineer_at_Sydney_Locations(String,String,String)"
});
formatter.result({
  "duration": 15005944437,
  "status": "passed"
});
});