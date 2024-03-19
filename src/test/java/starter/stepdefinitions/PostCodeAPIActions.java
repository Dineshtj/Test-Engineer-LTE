package starter.stepdefinitions;

import io.restassured.response.Response;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;


public class PostCodeAPIActions {

    /*
     * This class contain the steps that can be called on PostCode API endpoint.
     * BASE_URL will be fetched from the serenity.conf file  with getProperty method
     */

    private String BASE_URL = "https://api.postcodes.io/postcodes/";

    @Step("Call PostCode endpoint with the postcode : {0}")
    public void callPostCodeAPI(String postcode) {
        String url = BASE_URL;
        Response response = SerenityRest
                .given()
                .pathParam("postcode", postcode)
                .header("Accept", "application/json")
                .when()
                .get(url + "{postcode}");
    }

}
