package com.rmgyantra.authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AuthenticationTest {
	@Test
	public void preeptiveAuth() {
		given()
		.auth().preemptive().basic("rmgyantra", "rmgy@9999")
		.when()
		.get("http://localhost:8084/login")
		.then()
		.assertThat().statusCode(202)
		.contentType(ContentType.JSON)
		.log().all();        
	}
	@Test
	public void digestiveAuth() {
		given()
		      .auth().digest("rmgyantra", "rmgy@9999")
		.when()
		     .get("http://localhost:8084/login")
		.then()
		     .assertThat().statusCode(202)
		     .assertThat().contentType(ContentType.JSON)
		     .log().all();
	}
}
