package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rmgyantra.pojoLib.JsonPojoLib;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class ToCheckProjectNameTest {
	@Test
	public void validation() {
		
		Random ran =new Random();
		int r=ran.nextInt(1000);//asdm96
		
		String expectedProName="OM_2"+r;
		
		JsonPojoLib jpoj=new JsonPojoLib(expectedProName,"Vikas","On Going",101);
		
		Response response = given()
				                  .body(jpoj)
				                  .contentType(ContentType.JSON)
		.when().post("http://localhost:8084/addProject");
		
		String actualProjectName = response.jsonPath().get("projectName");
		
		Assert.assertEquals(actualProjectName,expectedProName );
	}

}
