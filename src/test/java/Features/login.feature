Feature: Application login

  Scenario: login with valid credentials
    Given I am on the login page
    When I fill in Email with "test@test.com"
    And I fill in Password with "1234"
    And I press Submit
    Then I should be on the users home page
    And I should see logged user "Alec Test"
    And I should see "LOGOUT" button