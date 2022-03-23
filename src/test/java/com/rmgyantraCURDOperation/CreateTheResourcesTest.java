package com.rmgyantraCURDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateTheResourcesTest {
	@SuppressWarnings("unchecked")
	@Test
	public void create() {

		//create an object for JSONObject class and pass the json body in the form of key and values pair using put method
		JSONObject obj =new JSONObject();
		obj.put("projectName", "Trishul1262");
		obj.put("teamSize", "100");
		obj.put("createdBy", "Vikas");
		obj.put("createdOn", "08/02/2022");
		obj.put("status", "complited");

		//setting the pre conditions for request and content type
		RequestSpecification reqspe = RestAssured.given();
		reqspe.contentType(ContentType.JSON);
		reqspe.body(obj);

		//action
		Response response = reqspe.post("http://localhost:8084/addProject");

		//post condition :validation and printing the response in console
		ValidatableResponse validate = response.then();
		validate.assertThat().statusCode(201);
		validate.assertThat().contentType(ContentType.JSON);
		validate.log().all();

	}
}
