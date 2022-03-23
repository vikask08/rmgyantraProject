package com.rmgyantraTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rmgyantra.genericUtility.BaseApiClass;
import com.rmgyantra.genericUtility.EndPoints;
import com.rmgyantra.pojoLib.JsonPojoLib;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateARequest extends BaseApiClass {
	@Test
	public void create() throws Throwable {
		int randomnumber=jUtil.randomNumber();
		String expectedProjectName="Myntra"+randomnumber;
		JsonPojoLib pojo = new JsonPojoLib(expectedProjectName,"VikasK","complited", 202);
		Response response = given()
				.body(pojo)
				.contentType(ContentType.JSON)
				.when()
				.post(EndPoints.ADDPROJECT);
		String responseProjectName = response.jsonPath().get("projectName");
		response.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		String query="select * from project";
		String databaseProjectName = dUtil.getTheDataAndVerifyData(query, 4, expectedProjectName);
		Assert.assertEquals(expectedProjectName, responseProjectName);
		Assert.assertEquals(responseProjectName, databaseProjectName);
	}
	@Test
	public void delete() {
		//String projectId = "TY_PROJ_4204";
		when().delete(EndPoints.DELETEPROJECT)
		.then()
		     .statusCode(204)
		     .log().all();
	}
}
