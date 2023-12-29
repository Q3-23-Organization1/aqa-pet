Feature: get resource functionality
  As a user
  I want to be able to get resource by id

  Scenario: get resource by exist id
    When I send request to get resource by exist id
    Then Should receive 'resourceByIdBody.json' resource data

  Scenario Outline: get resource by nonexistent id
    When I send request to get resource by nonexistent id
    Then Should receive <file> resource data with empty body
    Examples:
      | file|
      | "resourceByIdNoBody.json"|