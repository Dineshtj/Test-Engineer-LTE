package starter.stepdefinitions;

import io.restassured.path.json.JsonPath;
import net.serenitybdd.annotations.Step;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CommonQuestions {


    @Step("Verify response schema with spec - {0}")
    public void verifyResponseSchema(String schemaJson) {
        lastResponse().then()
                .body(matchesJsonSchemaInClasspath("schema/" + schemaJson));
    }

    @Step("Verify the response status code matches - {0}")
    public void verifyStatuscode(Integer responseCode) {
        lastResponse().then()
                .statusCode(responseCode);
    }

    /*
     * This common method takes key in the form of jsonpath and expected value, and verifies with actual response json.
     */
    @Step("Verify response JsonPath key {0} matches value {1}")
    public void verifyResponseKeyValue(String key, String expectedValue) {
        JsonPath jsonPath = new JsonPath(lastResponse().body().asString());
        String actualValue = jsonPath.get(key).toString();
        if (actualValue != null)
            assertThat(actualValue, equalTo(expectedValue));
    }
}