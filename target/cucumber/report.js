$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ApiGet.feature");
formatter.feature({
  "line": 2,
  "name": "get article by id",
  "description": "",
  "id": "get-article-by-id",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "return article json by ID",
  "description": "",
  "id": "get-article-by-id;return-article-json-by-id",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I make a GET request to the discovery API with articleID",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The API Should return the article JSON",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The articleType should be article",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.getAPI()"
});
formatter.result({
  "duration": 1049737758,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.checkJson()"
});
formatter.result({
  "duration": 464470189,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.checkArticleType()"
});
formatter.result({
  "duration": 60158954,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "retrieve the hasXmlAsset",
  "description": "",
  "id": "get-article-by-id;retrieve-the-hasxmlasset",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I make a Get request to the API with articleID",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "The returned JSON should have node hasXmAsset",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "The ID is present",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.i_make_a_Get_request_to_the_API_with_articleID()"
});
formatter.result({
  "duration": 55159355,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.the_returned_JSON_should_have_node_hasXmAsset()"
});
formatter.result({
  "duration": 62923296,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.the_ID_is_present()"
});
formatter.result({
  "duration": 74983253,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Create Issue using a POST",
  "description": "",
  "id": "get-article-by-id;create-issue-using-a-post",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I make a POST request with JSON body for creation of an issue",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "The response should return 201",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "response contains the id of the created issue",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefs.i_make_a_POST_request_with_JSON_body_for_creation_of_an_issue()"
});
formatter.result({
  "duration": 696741164,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 27
    }
  ],
  "location": "StepDefs.the_response_should_return(int)"
});
formatter.result({
  "duration": 9858677,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.response_contains_the_id_of_the_created_issue()"
});
formatter.result({
  "duration": 18019314,
  "status": "passed"
});
});