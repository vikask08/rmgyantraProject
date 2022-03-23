package requestChaining;

import org.testng.annotations.Test;

import com.rmgyantra.pojoLib.JsonPojoLib;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateAndDeleteWithRequestChaining {
	@Test
	public void createAndDelete() {

		Random ran =new Random();
		int r=ran.nextInt(1000);

		JsonPojoLib poj=new JsonPojoLib("uninor"+r, "vikas", "complited", 2);
		Response re =  given()
				.body(poj)
				.contentType(ContentType.JSON)

				.when().post("http://localhost:8084/addProject");
		String proId = re.jsonPath().get("projectId");
		System.out.println(proId);

		given()
		.pathParam("projectId", proId)

		.when()
		.delete("http://localhost:8084/projects/{projectId}")
		.then()
		.assertThat().statusCode(204)
		.log().all();



	}

}
