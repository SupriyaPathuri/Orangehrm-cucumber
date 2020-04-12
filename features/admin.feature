
@admin
Feature: check the system user details

  Scenario Outline: check the user details with valid credentials and Invalid credentials
    Given Open chrome and start application
    When I enter valid "<usernameNumber>" 
    When user should be able to login
    When admin is clicked
    When I enter valid username
    When clicking the Search button
    Then user details displayed

     Examples:
     |usernameNumber|
     |1| 
     