package com.rmgyantraCURDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CompliteUpdation {
	@SuppressWarnings("unchecked")
	@Test
	public void updation() {
      JSONObject obj=new JSONObject();
      obj.put("projectName", "Chakra");
		obj.put("teamSize", "101");
		obj.put("createdBy", "Vikas");
		obj.put("createdOn", "08/02/2022");
		obj.put("status", "complited");
		
		
		RequestSpecification reqspe = RestAssured.given();
		reqspe.body(obj);
		reqspe.contentType(ContentType.JSON);
		
		Response response = reqspe.put("http://localhost:8084/projects/TY_PROJ_402");
		ValidatableResponse validate = response.then();
		validate.assertThat().statusCode(200);
		validate.assertThat().contentType(ContentType.JSON);
		
		validate.log().all();
	}
}
