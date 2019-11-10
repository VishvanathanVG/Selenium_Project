Feature: Merge Lead Test Scenarios

Background:

Given Open the chrome browser for merge lead
And Maximise the browser for merge lead
And Enter the URL for merge lead

Scenario Outline: Merge Lead Test Cases

And Merge Lead Enter the username as <username> 
And Merge Lead Enter the password as <password>
When Click on login button for merge lead
And  Click on Crmsfa for merge lead
And Click on lead links for merge lead
And Click on merge lead links
And Click on fromlead icon on merge lead page
And Navigating to find leads for merge firstname
And Entering the firstname as <FirstName> in find lead page
And Click on find lead button in find lead page to find firstname lead
And Select the first resulting lead id for firstname
And Back to basewindow after selecting firstname
And Click on tolead icon on merge lead page
And Navigating to find leads for merge lastname
And Entering the Lastname as <LastName> in find lead page
And Click on find lead button in find lead page to find lastname lead
And Select the first resulting lead id for lastname
And Back to basewindow after selecting lastname
And Click on merge lead button in merge lead page
And Accepting the alert
Then verify mergerid in viewleadpage
When Click on the find lead links to validate id
And Enter the firstname id from captured fromlead id
And Click on find lead button to check the fromlead id
Then Verify the norecords display for fromlead id
Then Close the browser for merge lead page.  

Examples:
|username|password|FirstName|LastName|
|DemoSalesManager|crmsfa|a|f|