package com.rmgyantra.authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BarerTokenTest {
	@Test
	public void authentication() {
		given()
		      .auth().oauth2("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")
	    .when()
	         .get("https://api.github.com/user/repos")
	     .then()
	          .assertThat().statusCode(200)
	          .assertThat().contentType(ContentType.JSON)
	          .log().all();
	}

}
