Feature: Registration

  Scenario:
    Given I am on the registration page
    When I fill in First name with "Test"
    And I fill in Last name with "Worker"
    And I fill in Email with "worker@test.com"
    And I fill in date of birth with "01012000"
    And I fill in Password with "1234"
    And I fill in Password with "1234"
    And I choose "WORKER"
    And I press Submit
    And I fill in Description with "Carpenter"
    And I fill in Phone Number with "+3612345678"
    And I press Submit
    Then I should see the Login page
    And I am able to log in

  Scenario:
    Given I am on the registration page
    When I fill in First name with "Test"
    And I fill in Last name with "User"
    And I fill in Email with "user@test.com"
    And I fill in date of birth with "01012000"
    And I fill in Password with "1234"
    And I fill in Password with "1234"
    And I choose "USER"
    And I press Submit
    Then I should see the Login page
    And I am able to log in

