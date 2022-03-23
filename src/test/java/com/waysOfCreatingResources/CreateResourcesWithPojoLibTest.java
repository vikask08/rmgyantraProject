package com.waysOfCreatingResources;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.rmgyantra.pojoLib.JsonPojoLib;

import io.restassured.http.ContentType;

public class CreateResourcesWithPojoLibTest {
	@Test
	public void ceate() {
		
		JsonPojoLib pLIb=new JsonPojoLib("software solution","VikaShaliniGupta", "complited", 100);
		given()
	     .body(pLIb)
	     .contentType(ContentType.JSON)
	.when()
	     .post("http://localhost:8084/addProject")
	.then()
	     .statusCode(201)
	     .contentType(ContentType.JSON)
	     .log().all();
	}

}
