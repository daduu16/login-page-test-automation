Feature: Login Test

  Scenario: Successful login
    Given User is on login page
    When User enters username "student" and password "Password123"
    And User clicks login button
    Then User should see dashboard



