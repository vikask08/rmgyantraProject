package endToEnd;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import com.rmgyantra.pojoLib.JsonPojoLib;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class Create_Project_and_Allocate_USERTest {
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void endToEndTest() {
		Random ran =new Random();
		int r=ran.nextInt(1000);
		JsonPojoLib poj=new JsonPojoLib("Jio Mart"+r, "vikas", "complited", 2);
		Response re =  given()
				.body(poj)
				.contentType(ContentType.JSON)

				.when().post("http://localhost:8084/addProject");
		String proName= re.jsonPath().get("projectName");
		System.out.println(proName);
		re.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON);
		given()
		.pathParam("projectName", proName);
		System.out.println(proName);

		JSONObject obj=new JSONObject();
		obj.put("designation", "SDET_29");
		obj.put("dob", "25/05/1990");
		obj.put("email", "nithesh@gmail.com");
		obj.put("empName", "nithesh");
		obj.put("experience",15);
		obj.put("mobileNo", "9888707607");
		obj.put("project", proName);
		obj.put("role", "ROLE_ADMIN");
		obj.put("username", "nithesh"+r);

		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/employees")
		
		.then()
		      .assertThat().statusCode(201)
		      .contentType(ContentType.JSON)
		      .assertThat().time(Matchers.lessThan(600L), TimeUnit.MILLISECONDS)
		      .log().all();	

	}
}
