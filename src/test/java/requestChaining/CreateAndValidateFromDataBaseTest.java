package requestChaining;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.mysql.cj.jdbc.Driver;
import com.rmgyantra.pojoLib.JsonPojoLib;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
/**
 * 
 * @author ViaksK
 *
 */
public class CreateAndValidateFromDataBaseTest {
	/**
	 * 
	 * @throws SQLException
	 */
	@Test
	public void create() throws SQLException {
		String expectedProName=null;
		Random ran =new Random();
		int r=ran.nextInt(1000);
		JsonPojoLib pojo=new JsonPojoLib("AadiYogi"+r,"Vikas","Complited",10);
		Response response = given()
				.body(pojo)
				.contentType(ContentType.JSON)
				.when()
				.post("http://localhost:8084/addProject");
		String actualProName=response.jsonPath().get("projectName");
		Connection conn = null;
		try {
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");

			Statement stat=conn.createStatement();
			String quary = "select * from project";
			ResultSet resultset=stat.executeQuery(quary);
			while(resultset.next()) {
				if (actualProName.equals(resultset.getString(4))) {
					expectedProName=resultset.getString(4);
				}
			}
		}
		catch(Exception e){
		}finally {
			conn.close();
		}
		Assert.assertEquals(actualProName, expectedProName);
	}
}