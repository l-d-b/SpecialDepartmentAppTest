Feature: The user can filter by work object

  Scenario Outline: Choose a work object and make sure that suitable workers show up
    Given User should landing on main page
    Then User click on Extra Search menu point
    And User click on Work Object menu point
    Then User click on a workObject
    And Chek that the proper workers show up <numberOfWorker>
    And Tear down

    Examples:

      | numberOfWorker |
      | 7              |
      | 8              |
      | 7              |
      | 6              |
      | 6              |
      | 5              |
      | 4              |
      | 7              |
      | 9              |
      | 7              |
      | 5              |
      | 5              |
      | 5              |