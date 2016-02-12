
Feature: get article by id

  @wip
Scenario: return article json by ID
  Given I make a GET request to the discovery API with articleID
  Then The API Should return the article JSON
  And The articleType should be article

  @wip
Scenario: retrieve the hasXmlAsset
  Given I make a Get request to the API with articleID
  Then The returned JSON should have node hasXmAsset
  And  The ID is present


Scenario: Create Issue using a POST
  Given I make a POST request with JSON body for creation of an issue
  Then The response should return 201
  And response contains the id of the created issue