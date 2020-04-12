
@leave
Feature: To assign leave to an employee

  Scenario Outline: check the user details with valid credentials and Invalid credentials
    Given Open chrome and start application
    When I enter valid "<usernameNumber>" 
    When user should be able to login
    When In dashboard assign leave is clicked
    When I enter valid Employee Name
    When select leave type
    When I click from calender
    When I enter from date
    When I click to calender
    When I enter to date
    When I select Partial days
    When clicking the Assign button
    Then leave is assigned to employee

     Examples:
     |usernameNumber|
     |1| 
     