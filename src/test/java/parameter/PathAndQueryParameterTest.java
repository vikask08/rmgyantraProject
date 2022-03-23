package parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathAndQueryParameterTest {
	@Test
	public void parameter() {
		given()
		      .pathParam("username", "vikask08")
		      .queryParam("sort","created")
		      .queryParam("page", "2")
	   .when()
	        .get("https://api.github.com/users/{username}/repos")
	   .then()
	        .assertThat().statusCode(200)
	        .log().all();
		    
	}

}
