@tag
Feature: Feature to test getting Flight info

  @tag1
  Scenario Outline: Getting Flight info
    Given browser is open and on Blaze demo website
    And User waits 6 seconds
    And User chooses "<Departure city>", "<Destination city" and "<flight number>"
    And User waits 6 seconds
    And User enters "Amit Barua" into "inputName" field
    And User enters "123 Main St" into "address" field
    And User enters "Long Beach" into "city" field
    And User enters "CA" into "state" field
    And User enters "90716" into "zipCode" field
    And User enters "American Express" into "cardType" field
    And User enters "1234567890123456" into "creditCardNumber" field
    And User enters "Amit Barua" into "nameOnCard" field
    And User waits 7 seconds to review
    And User click the "Purchase Flight" button
    And User waits 8 seconds to confirm
    Then Browser closes

Examples:
  | Departure city | Destination city | flight number |
  | São Paolo      | Buenos Aires     |  43           |
  | Mexico City    | Rome             |  234          |
  | San Diego      | London           |  9696         |
  | Portland       | Berlin           |  12           |
  | Boston         | New York         |  4346         |
  | Philadelphia   | Dublin           |  43           |
  | Paris          | Cairo            |  234          |
 

 
