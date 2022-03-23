package com.rmgyantraCURDOperationWithBDDFeature;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CompliteUpdationOfResourcesTest {
	@Test
	public void updation() {
		
		JSONObject jobj=new JSONObject();
		
		jobj.put("projectName", "MV College Buxar");
		jobj.put("createdBy", "Vikas");
		jobj.put("status", "completed");
		jobj.put("teamSize", 1000);
		
		given()
		     .body(jobj)
		     .contentType(ContentType.JSON)
		.when()
		      .put("http://localhost:8084/projects/TY_PROJ_814")
		.then()
		      .assertThat().statusCode(200)
		      .contentType(ContentType.JSON)
		      .log().all();
	}

}
