package com.waysOfCreatingResources;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateResourceWithHelpOfJsonFileTest {
	@Test
	public void create() {
		File file=new File("./src/main/resources/jasonobject.json");
		
		given()
		     .body(file)
		     .contentType(ContentType.JSON)
		.when()
		     .post("http://localhost:8084/addProject")
		.then()
		     .statusCode(201)
		     .contentType(ContentType.JSON)
		     .log().all();
	}

}
