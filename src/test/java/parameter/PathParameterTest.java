package parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameterTest {
	@Test
	public void pathParameter() {
		String proID="TY_PROJ_1407";
		
		given()
		     .pathParam("projectId", proID)
	    .when()
	         .delete("http://localhost:8084/projects/{projectId}")
	      .then()
	           .assertThat().statusCode(204)
	           .log().all();
	}

}
