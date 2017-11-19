Feature: registering a new user

In order to become a site member
As a site visitor
I want to go to registration page, enter first name, last name, phone, email, address, user name, and password to register for the site

Scenario: positive - register one user

Given user visit newtours homepage
When user click on register link
And user enter username, password, confirm password, and click submit
Then user receives a confirmation
And user closes the browser
