Feature: Techfios Page
As a user I want to change the background color

Scenario: Sky Blue Background
  Given Set SkyBlue background button exists
  When I click on the skyblue button
  Then The background color will change to sky blue

Scenario: White Background Change
 Given Set SkyWhite Background button exists 
   When I click on the white button; 
  Then the background color will change to white







#Scenario 1: Sky Blue Background;
# Given: "Set SkyBlue Background" button exists;
# When: I click on the button;
# Then: the background color will change to sky blue
#Scenario 2: White Background Change; 
#Given: "Set SkyWhite Background" button exists; 
#When: I click on the button; 
#Then: the background color will change to white

#Feature:  As a user I want a login page so that only authentic 
#     users will be able to login
#     
# Scenario:  Valid users should be able to login
#     Given a valid user
#     When user goes to the Site 
#     Then Login Page should be displayed 
#     When user enters valid user name "techfiosdemo@gmail.com" and password "abc123"
#    Then Dashboard page should display     