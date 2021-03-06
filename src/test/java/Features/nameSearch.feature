Feature: Find a worker by name

  Scenario Outline: Send valid and invalid name
    Given User should landing on main page
    When User click on Extra Search menu point
    Then User write in the Name Search field <name>
    Then Check that the proper workers show up <expectedResult>
    And Tear down

    Examples:
      | name       | expectedResult      |
      | Lukas      | Lukas Phillips (54) |
      | BurgerKing | No worker found!    |
