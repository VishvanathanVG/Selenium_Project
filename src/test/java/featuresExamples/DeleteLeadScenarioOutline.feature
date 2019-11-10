Feature: Delete Lead Test Scenario

Background: 

Given Open the chrome browser for delete lead
And Maximise the browser for delete lead
And Enter the URL for delete lead


Scenario Outline: Delete Lead Test Cases

And Delete Lead Enter the username as <username> 
And Delete Lead Enter the password as <password>
When Click on login button for delete lead
And  Click on Crmsfa for delete lead
Given Click on lead links for delete lead
When Click on find lead link for delete lead
And Click on phone number
And Enter the phone number as <phonenumebr> in find lead page
And Click on find leads button
And Capture the first resulting lead id
Then Click on First resulting lead id
When Click on delete button
And Click on find leads links for delete
And Enter the captured lead id in find lead page
And Click on find lead buttons to find deleted lead id
Then Verify the norecords display message as <norecords>
Then Close the browser for delete lead

Examples:
|username|password|phonenumebr|norecords|
|DemoSalesManager|crmsfa|99|No|
|DemoSalesManager|crmsfa|1|No|