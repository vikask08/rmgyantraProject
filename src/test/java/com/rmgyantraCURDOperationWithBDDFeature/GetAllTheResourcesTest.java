package com.rmgyantraCURDOperationWithBDDFeature;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllTheResourcesTest {
	@Test
	public void getResource() {
		
		/*The primary keywords are:
			Feature.
			Rule (as of Gherkin 6)
			Example (or Scenario )
			Given , When , Then , And , But for steps (or * )
			Background.
			Scenario Outline (or Scenario Template )
			Examples (or Scenarios )*/
		
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat() .contentType(ContentType.JSON)
		.and()
		.assertThat().statusCode(200)
		.log().all();
	}
}
