Feature: CreateLead

Background:

Given Open the chrome browser
And Maximise the browser
And Enter the URL

@SmokeTest
Scenario Outline:TC001 CreateLead Postive TestCases

And Enter the username as <username>
And Enter the password as <password>
When Click on login button
And  Click on Crmsfa
Then Verify HomePage
When Click on CreateLead button
When Enter the companyname as <companyname>
When Enter the firstname as <firstname>
When Enter the lastname as <lastname>
Then Click on CreateSubmitt button
Then Verify the leadname
Then close the browser

Examples:

|username|password|companyname|firstname|lastname|
|DemoSalesManager|crmsfa|TCS|Vishvanathan|Veerabathiran|
|Democsr|crmsfa|TataConsultancyServices|Vishvanathan|Veerabathiran|

@RegressionTest
Scenario Outline:TC002 CreateLead Negative TestCases

And Enter the username as <username>
And Enter the password as <password>
When Click on login button
And  Click on Crmsfa
Then Verify HomePage
When Click on CreateLead button
When Enter the companyname as <companyname>
When Enter the firstname as <firstname>
When Enter the lastname as <lastname>
Then Click on CreateSubmitt button
But Verify the leadname unsucessful
Then close the browser

Examples:
|username|password|companyname|firstname|lastname|
|DemoSalesManager|crmsfa|TCS|Vishvanathan|Veerabathiran|
|Democsr|crmsfa|TataConsultancyServices|Vishvanathan|Veerabathiran|