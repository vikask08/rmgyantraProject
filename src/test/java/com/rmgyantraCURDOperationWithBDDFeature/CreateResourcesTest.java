package com.rmgyantraCURDOperationWithBDDFeature;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Then;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateResourcesTest {
@Test
public void create() {
	
	JSONObject jobj=new JSONObject();
	jobj.put("projectName", "MV College Buxar");
	jobj.put("createdBy", "Vikas");
	jobj.put("status", "completed");
	jobj.put("teamSize", 1000);
	
	given()
	     .body(jobj)
	     .contentType(ContentType.JSON)
	.when()
	     .post("http://localhost:8084/addProject")
	.then()
	      .assertThat().statusCode(201)
	      .contentType(ContentType.JSON)
	      .log().all();
	     
}
}
