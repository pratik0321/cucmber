#This is what a BA does
Feature: Test the skillary app
1)Valid cases
2)Invalid cases
#use background for common things

Background:
Given I should open the browser and navigate to the login page of skillary
#" " used for passing value to the application

#Scenario: To test the login with user credentials
#When Enter Username "user"
#And Enter password "user"
#And click on login button
#Then I should see the username as "Harry Den"
#Scenario: To test the login with admin credentials
#When Enter Username "admin"
#And Enter password "admin"
#And click on login button
#Then I should see the admin as "SkillRary Admin"

#to run multiple positive cases we use Scenario Outline
Scenario Outline: to test login with all positive data
When Enter Username "<user>"
And Enter password "<pwd>"
And click on login button
Then I should see the username as "<name>"
 
Examples:
|user|pwd|name| 
|user|user|Harry Den| 
|user|user|Harry Den| 
|admin|admin|SkillRary Admin|

Scenario: To test the login with invalid credentials
When Enter Username "pratik"
And Enter password "madhu"
And click on login button
Then I should see the Registration page "Register"