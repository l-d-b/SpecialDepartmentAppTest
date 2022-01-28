Feature: Application login

  Scenario Outline: login with invalid credentials
    Given I am on the login page
    When I fill in Email with <Username>
    And I fill in Password with <Password>
    And I press Submit
    Then I should see warning message <expectedText>
    And Login correct
    And Tear down
    Examples:
      | Username | Password | expectedText |
      | "test@test.com" | "wrongpassword" | Wrong email address or password was given! Try again.. |
      | "wrongemail@test.com" | "1234" | Wrong email address or password was given! Try again..|

  Scenario: login with valid credentials
    Given I am on the login page
    When I fill in Email with "test@test.com"
    And I fill in Password with "1234"
    And I press Submit
    Then I should see logged user "Logged user: Alec Test"
    And I should see "LOGOUT" button
    And Tear down