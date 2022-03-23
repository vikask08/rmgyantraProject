package com.rmgyantraCURDOperationWithBDDFeature;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PartialUpdationResourcesTest {
	@Test
	public void updation() {
		JSONObject obj =new JSONObject();
		obj.put("name","Vikas");
		obj.put("job", "SenieorSoftwareEngineer");	
		
	   given()
	         .body(obj)
	         .contentType(ContentType.JSON)
	   .when()
	         .patch("https://reqres.in/api/users/2")
	   .then()
	        .assertThat().statusCode(200)
	        .contentType(ContentType.JSON)
	        .log().all();
	}

}
