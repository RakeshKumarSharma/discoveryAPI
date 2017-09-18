package com.rakesh;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.matcher.RestAssuredMatchers.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by rakesh.sharma on 02/02/2016.
 * Command Line Running: mvn -Dcucumber.options="--tags @wip" test
 * -Dcucumber.options=“—tags @satish —tags=~@satya”
 * The above will include @satish and will exclude @satya.

 */
public class StepDefs {

    private Response response;

    public StepDefs(){
        RestAssured.baseURI = "http://hub-api-qa.dev.cf.private.springer.com/api/v1/";
    }

    private Response getResponse() {
        return given().parameters("client", "maestro", "domain", "all").get("articles/s00125-016-4106-test_n_issues_184");
    }
    private void postResponse(){

        String issueJson = "{\n" +
                "  \n" +
                "  \"issue\": {\n" +
                "    \"type\": \"issues\",\n" +
                "    \"description\": \"Automated issue 1\",\n" +
                "    \"issue\": \"50\",\n" +
                "    \"volume\": \"1\",\n" +
                "    \"coverDate\": \"2015-10-01\",\n" +
                "    \"hasJournal\": {\n" +
                "      \"id\": \"natrevchem\",\n" +
                "      \"type\": \"journals\"\n" +
                "    },\n" +
                "    \"hasItem\":{\n" +
                "            \"list\":[\n" +
                "                  {\n" +
                "                      \"id\":\"s00125-016-4106-test_n_issues_184\" ,\n" +
                "                      \"type\":\"articles\" \n" +
                "                  }    \n" +
                "            ]\n" +
                "          }\n" +
                "    \n" +
                "  }\n" +
                "\n" +
                "}";

         response = given().
                contentType("application/json").
                body(issueJson).when().
                post("issues?client=maestro&domain=nature&production=true");

    }


    @Given("I make a GET request to the discovery API with articleID")
    public void getAPI(){
        getResponse();
    }

    @Then("^The API Should return the article JSON$")
    public void checkJson(){
        getResponse().then().body("article.id", equalTo("s00125-016-4106-test_n_issues_184"));
        }

    @Then("^The articleType should be article$")
    public void checkArticleType(){
        getResponse().then().body("article.type", equalTo("articles"));
    };

    @Given("^I make a Get request to the API with articleID$")
    public void i_make_a_Get_request_to_the_API_with_articleID() {
        getResponse();
    }

    @Then("^The returned JSON should have node hasXmAsset$")
    public void the_returned_JSON_should_have_node_hasXmAsset()  {
        getResponse().then().body("article.hasXmlAsset",notNullValue());
    }

    @Then("^The ID is present$")
    public void the_ID_is_present() {
        getResponse().then().body("article.hasXmlAsset.id",equalTo("s00125-016-4106-test_n_issues_184.xml"),
                             "article.hasXmlAsset.type",equalTo("xml-assets"),
                             "article.hasXmlAsset.mimetype",equalTo("application/xml"),
                             "article.hasXmlAsset.link",equalTo("http://hub-api-qa.dev.cf.private.springer.com/assets/v1/xml-assets/s00125-016-4106-test_n_issues_184.xml"));
    }


    @Given("^I make a POST request with JSON body for creation of an issue$")
    public void i_make_a_POST_request_with_JSON_body_for_creation_of_an_issue()  {
         postResponse();
    }

    @Then("^The response should return (\\d+)$")
    public void the_response_should_return(int status)  {
        response.then().statusCode(status);
    }

    @Then("^response contains the id of the created issue$")
    public void response_contains_the_id_of_the_created_issue()  {
        response.then().body("issue.hasItem.list[0].id", equalTo("s00125-016-4106-test_n_issues_184"));
        System.out.println(response.asString());
    }
}
