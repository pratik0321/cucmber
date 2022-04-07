Feature: Test the skillrary App
1) Valid Case
2) Invalid Case

#use Background to make  work with common things
Background:
Given i should open the browser and naviagte to the login page of skillrary

#anything passed in "" 
Scenario: To Test the Login with user Credentials
When Enter Username "user"
And Enter Password "user"
And Click on the loginbutton
Then i should see the username as "Harry Den"


Scenario: To Test the Login with Admin Credentials
When Enter Username "admin"
And Enter Password "admin"
And Click on the loginbutton
Then i should see the username as "SkillRary Admin"

#@ stands for tag
#@NegativeTesting
Scenario: To Test the Login with invalid Credentials
When Enter Username "pratik"
And Enter Password "thapa"	
And Click on the loginbutton
Then i should navigate to the page "Register"