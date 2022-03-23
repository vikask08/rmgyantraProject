package com.rmgyantraCURDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PartialUpdationTest {
	@SuppressWarnings("unchecked")
	@Test
	public void update() {
		JSONObject obj =new JSONObject();
		obj.put("name","Vikas");
		obj.put("job", "SoftwareEngineer");	
        
		RequestSpecification reqspe = RestAssured.given();
		reqspe.body(obj);
		reqspe.contentType(ContentType.JSON);
		
		Response response = reqspe.patch("https://reqres.in/api/users/2");
		System.out.println(response.getContentType());
	    
		ValidatableResponse validate = response.then();
		validate.log().all();


	}
}
