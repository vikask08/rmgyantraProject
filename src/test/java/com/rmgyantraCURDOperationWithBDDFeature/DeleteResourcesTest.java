package com.rmgyantraCURDOperationWithBDDFeature;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteResourcesTest {
	@Test
	public void delete() {
		
	when()
	     .delete("http://localhost:8084/projects/TY_PROJ_814")
	.then()
	     .assertThat().statusCode(204)
	     .log().all();
	}

}
