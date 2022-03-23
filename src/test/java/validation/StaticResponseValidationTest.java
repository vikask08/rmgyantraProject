package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidationTest {
	@Test
	public void validation() {
		String expectedproname = "TY_PROJ_1403";
		Response response = when()
				.get("http://localhost:8084/projects");
	    response.then().log().all();
		String actualproname = response.jsonPath().get("[0].projectId");
		
		Assert.assertEquals(expectedproname, actualproname);
	}

}
