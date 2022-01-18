Feature: Choose a profession

  Scenario Outline: Choose a profession and make sure suitable workers show up
    Given User should landing on main page
    When User click on Profession menu point
    Then User click on a profession <profession>
    And Chek that the corresponding workers show up

    Examples:
      | profession                          |
      | Carpenter                           |
      | Electrician                         |
      | Gas Fitter                          |
      | Plumber                             |
      | Painter                             |
      | Cabinet Makers                      |
      | Mason                               |
      | Machinist                           |
      | Sheet Metal Worker                  |
      | Heating and Cooling System Mechanic |
      | Constructor helper                  |