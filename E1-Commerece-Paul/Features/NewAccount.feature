Feature: User is able to create an account with valid credentials 

Scenario Outline: User able to create an account usign valid credentials

Given The user in the homepage https://demo.oscommerce.com/index.php
And user clicks on Continue button under New Customer
Then User enters valid <'first_name'>,<'last_name'>,<'DOB'>,<'Email'>,<'Street'>,<'PostCode'>,<'City'>,<'State'> <'Telephone'>,<'password'> and <'confirm_password'> 
And User clicks on continue

Examples:

|first_name| |last_name| |DOB| |Email| |Street| |PostCode| |City| |State| |Telephone| |password| |confirm_password|
|Paul|        |da Idiot|    |07/01/1890| |sukhsngh245@gmail.com| |725 powerbutt| |09876| |Brooklyn| |NY|  |9871234534| |heybuddy| |heybuddy|