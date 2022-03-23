package validation;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ValidationUsingJHamRestTest {
	@Test
	public void validate() {
		when()
		    .get("http://localhost:8084/projects")
		.then()
		      .assertThat().time(Matchers.lessThan(600L), TimeUnit.MILLISECONDS)
		.log().all();
	}

}
