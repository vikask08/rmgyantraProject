package com.rmgyantraCURDOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllTheResourcesTest {
	@Test
	public void getResources() {
     
		//performing Get Action using restassured class get() method
		Response response = RestAssured.get("http://localhost:8084/projects");
		
		//getting the data from response using getters method
		System.out.println(response.contentType());
		System.out.println(response.statusCode());
		
		System.out.println(response.getTime());
		
		System.out.println(response.getHeader("Vary"));
		
		//System.out.println(response.asPrettyString());//print all the respose
		//response.prettyPeek();//print the header and body
		System.out.println(response.getBody());
		ValidatableResponse validate = response.then();
		validate.assertThat().statusCode(200);
		validate.log().all();
	}
}
