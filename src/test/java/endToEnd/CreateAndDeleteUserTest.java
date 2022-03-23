package endToEnd;

import static io.restassured.RestAssured.given;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateAndDeleteUserTest {
	@SuppressWarnings("unchecked")
	@Test
	public void createAndDelete() {
		Random ran =new Random();
		int r=ran.nextInt(1000);

		JSONObject obj=new JSONObject();
		obj.put("designation", "SDET_29");
		obj.put("dob", "25/05/1998");
		obj.put("email", "nithesh@gmail.com");
		obj.put("empName", "nithesh12");
		obj.put("experience",15);
		obj.put("mobileNo", "9888706607");
		obj.put("project", "pavan"+r);
		obj.put("role", "ROLE_ADMIN");
		obj.put("username", "nithesh"+r);

		Response resonse = given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/employees");
		String empId = resonse.jsonPath().get("employeeId");
		
		given()
	     .pathParam("userID", empId)
	 .when()
	       .delete("http://localhost:8084/employees/{userID}")
    .then()
        .assertThat().statusCode(204)
        .assertThat().time(Matchers.lessThan(600L), TimeUnit.MILLISECONDS)
         .log().all();
		
			

	}

}
