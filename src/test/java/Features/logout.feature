Feature: Application logout

  Scenario: logout
    Given I am logged in
    When I press LOGOUT button
    Then I should see the Login page
    And I go to Main page
    And I shouldn't see logged user
    And I should see "LOGIN" button
    And Tear down