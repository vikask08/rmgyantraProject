package com.rmgyantra.authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth2Test {
	@Test
	public void validation() {
		Response response = given()
				.formParam("client_id","SDET@29")
				.formParam("client_secret", "32c378610df0af73b97821b435e70e1a")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "https://example.com")
				.when()
				.post("http://coop.apps.symfonycasts.com/token");
		String token=response.jsonPath().getString("access_token");
		given()
		.auth().oauth2(token)
		.pathParam("USER_ID", 2953)
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed")
		.then()
		.log().all();


	}

}
