Feature: Choose a profession

  Scenario Outline: Choose a profession and make sure suitable workers show up
    Given User should landing on main page
    When User click on Profession menu point
    Then User click on a profession <profession>
    And Chek that the corresponding workers show up <profession> <numberOfWorker>
    And Tear down

    Examples:
      | profession                          | numberOfWorker |
      | Carpenter                           | 2              |
      | Electrician                         | 1              |
      | Gas Fitter                          | 1              |
      | Plumber                             | 3              |
      | Painter                             | 1              |
      | Cabinet Makers                      | 1              |
      | Mason                               | 2              |
      | Machinist                           | 1              |
      | Sheet Metal Worker                  | 2              |
      | Heating and Cooling System Mechanic | 1              |
      | Construction Helper                 | 1              |