package com.rmgyantraCURDOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteResorseTest {
	@Test
    public void delete() {
		Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1604");
		ValidatableResponse validate = response.then();
		validate.assertThat().statusCode(204);
		validate.log().all();
	}
}
