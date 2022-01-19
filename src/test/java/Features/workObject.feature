Feature: The user can filter by work object

  Scenario Outline: Choose a work object and make sure that suitable workers show up
    Given User should landing on main page
    Then User click on Extra Search menu point
    And User click on Work Object menu point
    Then User click on a workObject <workObject>
    And Chek that the proper workers show up <workObject> <numberOfWorker>
    And Tear down

    Examples:

      | workObject      | numberOfWorker |
      | Bedroom         | 7              |
      | Bathroom        | 8              |
      | Kitchen         | 7              |
      | Living Room     | 6              |
      | Hall            | 6              |
      | Balcony         | 5              |
      | Terrace         | 4              |
      | Attic           | 7              |
      | Outbuilding     | 9              |
      | Garage          | 7              |
      | Roof            | 5              |
      | Basement        | 5              |
      | House Structure | 5              |