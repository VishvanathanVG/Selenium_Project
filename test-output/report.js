$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featuresExamples/DuplicateLeadScenarioOutline.feature");
formatter.feature({
  "name": "Duplicate Lead Test Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Duplicate Lead Testcases",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Duplicate Lead Enter the username as \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Duplicate Lead Enter the password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Click on login button for duplicate lead",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Crmsfa for duplicate lead",
  "keyword": "And "
});
formatter.step({
  "name": "Click on the Leads links",
  "keyword": "Given "
});
formatter.step({
  "name": "Click on the find leads links",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Email button in find lead page",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the email id as \u003cEmailAddr\u003e in find lead page",
  "keyword": "And "
});
formatter.step({
  "name": "Click on the find leads button to get leads data",
  "keyword": "And "
});
formatter.step({
  "name": "Capture the name of first resulting lead",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Duplicate lead button in view lead page",
  "keyword": "And "
});
formatter.step({
  "name": "Verify the view lead page titles as \u003cduplicateTitleName\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on the create lead button",
  "keyword": "When "
});
formatter.step({
  "name": "Confirm the duplicated lead name as captured name",
  "keyword": "Then "
});
formatter.step({
  "name": "Close the browser for duplicate lead",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "EmailAddr",
        "duplicateTitleName"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa",
        "@gmail.com",
        "Duplicate"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa",
        "@",
        "Duplicate"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open the chrome browser for duplicate lead",
  "keyword": "Given "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.openTheChromeBrowserForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Maximise the browser for duplicate lead",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.maximiseTheBrowserForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the URL for duplicate lead",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.enterTheURLForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Duplicate Lead Testcases",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Duplicate Lead Enter the username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.duplicateLeadEnterTheUsernameAsUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Duplicate Lead Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.duplicateLeadEnterThePasswordAsPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button for duplicate lead",
  "keyword": "When "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnLoginButtonForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Crmsfa for duplicate lead",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnCrmsfaForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Leads links",
  "keyword": "Given "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnTheLeadsLinks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the find leads links",
  "keyword": "When "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnTheFindLeadsLinks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Email button in find lead page",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnEmailButtonInFindLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the email id as @gmail.com in find lead page",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.enterTheEmailIdAsGmailComInFindLeadPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the find leads button to get leads data",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnTheFindLeadsButtonToGetLeadsData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Capture the name of first resulting lead",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.captureTheNameOfFirstResultingLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Duplicate lead button in view lead page",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnDuplicateLeadButtonInViewLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the view lead page titles as Duplicate",
  "keyword": "Then "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.verifyTheViewLeadPageTitles(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the create lead button",
  "keyword": "When "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnTheCreateLeadButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Confirm the duplicated lead name as captured name",
  "keyword": "Then "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.confirmTheDuplicatedLeadNameAsCapturedName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser for duplicate lead",
  "keyword": "Then "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.closeTheBrowserForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open the chrome browser for duplicate lead",
  "keyword": "Given "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.openTheChromeBrowserForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Maximise the browser for duplicate lead",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.maximiseTheBrowserForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the URL for duplicate lead",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.enterTheURLForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Duplicate Lead Testcases",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Duplicate Lead Enter the username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.duplicateLeadEnterTheUsernameAsUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Duplicate Lead Enter the password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.duplicateLeadEnterThePasswordAsPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button for duplicate lead",
  "keyword": "When "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnLoginButtonForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Crmsfa for duplicate lead",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnCrmsfaForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Leads links",
  "keyword": "Given "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnTheLeadsLinks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the find leads links",
  "keyword": "When "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnTheFindLeadsLinks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Email button in find lead page",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnEmailButtonInFindLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the email id as @ in find lead page",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.enterTheEmailIdAsGmailComInFindLeadPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the find leads button to get leads data",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnTheFindLeadsButtonToGetLeadsData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Capture the name of first resulting lead",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.captureTheNameOfFirstResultingLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Duplicate lead button in view lead page",
  "keyword": "And "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnDuplicateLeadButtonInViewLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the view lead page titles as Duplicate",
  "keyword": "Then "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.verifyTheViewLeadPageTitles(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the create lead button",
  "keyword": "When "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.clickOnTheCreateLeadButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Confirm the duplicated lead name as captured name",
  "keyword": "Then "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.confirmTheDuplicatedLeadNameAsCapturedName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the browser for duplicate lead",
  "keyword": "Then "
});
formatter.match({
  "location": "DuplicateLeadStepsExamples.closeTheBrowserForDuplicateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});