package validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseAValidationTest {
	@Test
	public void validation() {
		String expectedProName="Softwaresol";
		
		Response response = when()
				      .get("http://localhost:8084/projects");
		List<String> actualProName = response.jsonPath().get("projectName");
		boolean flag=false;
		for (String proName : actualProName) {
			if (proName.equals(expectedProName)) {
				System.out.println("value is matches");
				flag=true;
			}
		}
		Assert.assertEquals(flag, true);
		//Assert.assertTrue(true);
	}

}
