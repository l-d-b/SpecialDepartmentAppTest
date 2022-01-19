Feature: Registration

#  Scenario:
#    Given I am on the registration page
#    When I fill in First name with "Test"
#    And I fill in Last name with "Worker"
#    And I fill in RegistrationEmail with "worker@test.com"
#    And I fill in date of birth with "01012000"
#    And I fill in RegistrationPassword with "1234"
#    And I fill in RegistrationPasswordAgain with "1234"
#    And I choose "WORKER"
#    And I press RegistrationSubmit
#    And I fill in Description with "Carpenter"
#    And I fill in Phone Number with "+3612345678"
#    And I press DetailsSubmit
#    Then I should see the Login page
#    And I am able to log in

  Scenario: User registration
    Given I am on the registration page
    When I fill in First name with "Test"
    And I fill in Last name with "User"
    And I fill in RegistrationEmail with "user@test.com"
    And I fill in date of birth with "01012000"
    And I fill in RegistrationPassword with "1234"
    And I fill in RegistrationPasswordAgain with "1234"
    And I choose "USER"
    And I press RegistrationSubmit
    Then I should see the Login page
    And I am able to log in with "user@test.com"
    And I should see logged user "Logged user: Test User"

