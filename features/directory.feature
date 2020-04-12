@directory
Feature: check the  complete details of user

  Scenario Outline: check the user details with valid credentials and Invalid credentials
    Given Open chrome and start application
    When I enter valid "<usernameNumber>" 
    When user should be able to login
    When directory is clicked
    When I enter valid name
    When click the Search button
    Then user details displayed

     Examples:
     |usernameNumber|
     |1| 