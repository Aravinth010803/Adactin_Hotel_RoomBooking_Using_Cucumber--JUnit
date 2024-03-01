Feature: validation of Adactin hotel web application for order Id generation
Background:
Given user Launch the adactin hotel web application

Scenario: validation of Login page with valid credential
When user enter valid username and password
And click the login button
Then verify user able to view the search hotel page
When Seclect valid Location,valid Hotel name,valid Room type
And click the search button
Then verify user able to view the next hotel page
When click on rodio button and continue button
Then verify user able to view the Book A Hotel page
When Enter the Valid First Name,valid Last Name,valid Billing Address and vaid Credit card Number
And Select valid Credit card type,Valid Expiry date and valid CVV number 
And click on the Book Now button
Then verify user able to view the Booking Confirmation page should be displayed 
When print the order number
Then order number should be printed

Scenario Outline: validation of Login page with valid username and valid password
When user enter valid "<username>" and valid "<password>"
And click on login button 
Then user able to view the error message  

Examples:
|username|password|
|AravinthKrish|ABC@123|
|AravinthKrish|ABC@124|
|AravinthKrish|ABC@125|
