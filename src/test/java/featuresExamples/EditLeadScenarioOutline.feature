Feature: Edit Lead Test Scenarios

Background:

Given Open the chrome browser for edit lead
And Maximise the browser for edit lead
And Enter the URL for edit lead


Scenario Outline: Edit Lead Positive Test Cases

And Edit Lead Enter the username as <username>
And Edit Lead Enter the password as <password>
When Click on login button for edit lead
And  Click on Crmsfa for edit lead
When Click on lead links
And Click on find lead link
And Enter the firstname in the find lead page as <firstname>
And Click on find lead button in find lead page
Then Select the first resulting lead id
Then Verify the title page of view lead page
When Click on edit button in view lead page
And Change the company name as <companyname> in edit lead page
And Click on submit button
Then Confirms the changed name as <expectedcompanyname>
Then Close the browser for edit lead

Examples:
|username|password|firstname|companyname|expectedcompanyname|
|DemoSalesManager|crmsfa|Vishvanathan|TATA Consultancy Services Limited|TATA Consultancy Services Limited|
#|DemoSalesManager|crmsfa|Vishvanathan|TCS|TCS|

Scenario Outline: Edit Lead Negative Test Cases

And Edit Lead Enter the username as <username> 
And Edit Lead Enter the password as <password>
When Click on login button for edit lead
And  Click on Crmsfa for edit lead
When Click on lead links 
And Click on find lead link
And Enter the firstname in the find lead page as <firstname>
And Click on find lead button in find lead page
Then Select the first resulting lead id
Then Verify the title page of view lead page
When Click on edit button in view lead page
And Change the company name as <companyname> in edit lead page
And Click on submit button
But Confirmed the changed name as incorrectly <expectedcompanyname>
Then Close the browser for edit lead
Examples:
|username|password|firstname|companyname|expectedcompanyname|
|DemoSalesManager|crmsfa|Vishvanathan|TATA Consultancy Services Limited|TCS|
#|DemoSalesManager|crmsfa|Vishvanathan|TCS|TATA Consultancy Services Limited|
