package com.waysOfCreatingResources;

import static io.restassured.RestAssured.*;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateResourcesWithHashMapTest {
	@Test
	public void createResource() {
		HashMap<String, Comparable> map=new HashMap<String, Comparable>();
	
		map.put("projectName", "OyoRooms");
		map.put("createdBy", "Vikas");
		map.put("status", "completed");
		map.put("teamSize", 1000);
		
		given()
		     .body(map)
		     .contentType(ContentType.JSON)
		.when()
		     .post("http://localhost:8084/addProject")
		.then()
		      .statusCode(201)
		      .contentType(ContentType.JSON)
		      .log().all();
	}

}
