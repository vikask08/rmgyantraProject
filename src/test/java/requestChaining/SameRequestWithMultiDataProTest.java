package requestChaining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rmgyantra.pojoLib.JsonPojoLib;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class SameRequestWithMultiDataProTest {
	@Test (dataProvider="getData")
	public void multipledata(String projectName, String createdBy, String status, int teamSize) {
		
		JsonPojoLib pojo=new JsonPojoLib(projectName,createdBy,status,teamSize);
		
		given()
		     .body(pojo)
		     .contentType(ContentType.JSON)
		.when()
		      .post("http://localhost:8084/addProject")
		.then()
		     .assertThat().statusCode(201)
		     .contentType(ContentType.JSON)
		     .log().all();
	}	
	@DataProvider
	public Object[][]  getData() {
		Object[][] objArry=new Object[4][4];
		
		objArry[0][0]="MahaShiv";
		objArry[0][1]="Vikas";
		objArry[0][2]="Complited";
		objArry[0][3]=100;
		
		objArry[1][0]="MahaShiv_1.0";
		objArry[1][1]="Abhishek";
		objArry[1][2]="On Going";
		objArry[1][3]=200;
		
		objArry[2][0]="MahaShiv_1.1";
		objArry[2][1]="Pratyush";
		objArry[2][2]="Complited";
		objArry[2][3]=300;
		
		objArry[3][0]="MahaShiv_1.22";
		objArry[3][1]="Nethra";
		objArry[3][2]="Complited";
		objArry[3][3]=400;
		
		return objArry;
	}

}
