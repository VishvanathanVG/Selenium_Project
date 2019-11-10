Feature: Duplicate Lead Test Scenarios

Background:

Given Open the chrome browser for duplicate lead
And Maximise the browser for duplicate lead
And Enter the URL for duplicate lead

Scenario Outline: Duplicate Lead Testcases

And Duplicate Lead Enter the username as <username> 
And Duplicate Lead Enter the password as <password>
When Click on login button for duplicate lead
And  Click on Crmsfa for duplicate lead
Given Click on the Leads links
When Click on the find leads links
And Click on Email button in find lead page
And Enter the email id as <EmailAddr> in find lead page
And Click on the find leads button to get leads data
And Capture the name of first resulting lead
And Click on Duplicate lead button in view lead page
Then Verify the view lead page titles as <duplicateTitleName>
When Click on the create lead button
Then Confirm the duplicated lead name as captured name
Then Close the browser for duplicate lead

Examples:
|username|password|EmailAddr|duplicateTitleName|
|DemoSalesManager|crmsfa|@gmail.com|Duplicate|
|DemoSalesManager|crmsfa|@|Duplicate|
