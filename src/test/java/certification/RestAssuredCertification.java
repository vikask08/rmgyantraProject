package certification;

import org.testng.annotations.Test;

import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;

public class RestAssuredCertification {
	@Test
	public void test() {
		RestAssuredConfig configuration = RestAssuredConfig
				                          .config()
				                          .sslConfig(new SSLConfig()
				                        		  .allowAllHostnames());
		
	}

}
