Feature: Checking for login, add to cart , checkout and logoff functionality 

Scenario Outline: User unable to login with invaild credentials 
Given User opens browser and navigates to url https://demo.oscommerce.com/index.php
And User clicks on my account tab 
Then User enters invalid <'invaliduser'> and <'invaildpassword'>
And User clicks submit button 
Then User should get an error


Examples: 
|invaliduser|   |invalidpassword|
|polandspring@gmail.com|  |water123|

Scenario Outline: User should be able to login with valid credentials 
Given User clears username 
And User valid <'username'> and <'password'>
Then Clicks submit button
And User should be able to login

Examples:
|username| 	|password|
|asf@gmail.com|			|123456a|


Scenario: User shoudl be able to navigate to quick find items and search mouse
Given User navigates to quick find
And Searches mouse 
Then User clicks submit

Scenario: User should be able to filter by price and add to cart 
Given User filters by price 
And adds the first item to cart 

Scenario: User navigate to catagories click on software and clicks on simulation and adds item to cart
Given User clicks on software
And User click on simulation
Then User adds item to cart

Scenario: User navigate to manufacturers select Samsung and add to cart
Given User navigates to manufacturers 
And  User selects Samsung
Then User adds to item to cart 

Scenario: User will be able to check out
Given User clicks on checkout

Scenario Outline: Change shipping address and click continue
Given User clicks on change address button
And User Enters valid credentials <'firstname'> , <'lastname'> , <'street'> , <'postcode'> , <'city'>  and <'state'>
Then User click continue


Examples:

|firstname|	|lastname|	|street| |postcode| |city| |state|
|Jenny|	|Fromtheblock|	|140 grace|	|90210|	|Bronx| |NY|

Scenario: User able to check out with valid payment
Given User clicks continue 
And User enters valid payment 
Then User clicks checkout 
And User logsoff




