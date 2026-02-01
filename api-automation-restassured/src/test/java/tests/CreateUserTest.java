package tests;

import org.json.JSONObject;
import static io.restassured.RestAssured.*;
import base.BaseTest;

public class CreateUserTest extends BaseTest {
	
	   public void CreateUser() {
		      JSONObject requist = new JSONObject();
		      requist.put("name", "srinivas");
		      requist.put("job", "qa auomation");
		      
		      
		      given()
		              .header("content-type", "application/json")
		              .body(requist.toString())
		       .when()
		              .post("/api/users")
		       .then()
		              .statusCode(201);
		       
	   }
	   
	   
	          

}
