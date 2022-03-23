package validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ValidationUsingHamrestTest {
	@Test
	public void validation() {
		when()
		    .get("http://localhost:8084/projects")
	.then()
	     .assertThat().body("[0].projectName",Matchers.equalTo("deepak_pro-1042"))
	     .assertThat().time(Matchers.lessThan(600L),TimeUnit.MILLISECONDS)
	     .assertThat().contentType(Matchers.equalTo("application/json"))
	     .log().all();
	}

}
