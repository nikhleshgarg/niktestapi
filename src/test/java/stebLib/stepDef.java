package stebLib;

import basePack.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

public class stepDef extends BaseClass  {
	Response response;
	
	@Given("I make get call on some api")
	public void i_make_get_call_on_some_api() {
		System.out.println("Test Csae exec nik started");
	    // Write code here that turns the phrase above into concrete actions
		response = (Response) SerenityRest.given().baseUri("https://api.polygon.io")
	    .queryParam("apiKey", "pd0XmC6zSMzgHTiPzX8PXSoYz4tyiHNY").log().all()
	    .get("/v2/aggs/ticker/DOCU/range/1/day/2023-10-06/2023-10-06").then().extract().body();
	}

	@Given("i validate that response status code is {int}")
	public void i_validate_that_response_status_code_is(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    response.prettyPrint();
	}

	@Then("i validate that repsonse is ok")
	public void i_validate_that_repsonse_is_ok() {
	    // Write code here that turns the phrase above into concrete actions
		response.prettyPrint();
	}

}
