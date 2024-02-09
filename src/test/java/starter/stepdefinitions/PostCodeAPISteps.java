package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import java.util.List;
import io.cucumber.datatable.DataTable;

public class PostCodeAPISteps {

    /*
     * @Steps PostCodeAPIActions contain the steps that can be called on PostCode API endpoint
     * @Steps CommonQuestions contain generic assertions that can be queried on any endpoint
     */

    @Steps
    PostCodeAPIActions postCodeAPIActions;

    @Steps
    CommonQuestions commonQuestions;

    @Given("the user queries postcode endpoint with (.+)$")
    public void theUserQueriesEndpointWithPostcode(String postcode) {
        postCodeAPIActions.callPostCodeAPI(postcode);
    }

    @Then("the response status code should be (.+)$")
    public void theStatusCodeIsStatuscode(Integer statuscode) {
        commonQuestions.verifyStatuscode(statuscode);
    }

    @Then("verify the below details in the response")
    public void verifyTheBelowDetailsInTheResponse(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> columns : rows) {
            commonQuestions.verifyResponseKeyValue(columns.get(0), columns.get(1));
        }
    }

    @And("the schema should match with the specification defined in (.*)$")
    public void theSchemeShouldMatchWithSpecDefinedIn(String spec) {
        commonQuestions.verifyResponseSchema(spec);
    }

    
}
