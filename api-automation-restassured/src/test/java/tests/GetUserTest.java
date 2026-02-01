package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import base.BaseTest;

public class GetUserTest extends BaseTest {
	     
	   @Test
	   public void GetallUsers() {  
		      
		    given()
		    .when()
		           .get("api/users/?page=2")
		    .then()
		           .statusCode(200);
	   }
	    
	   @Test
	   public void SingleUser() {
		    
		      given()
		      .when()
		               .get("api/user/2")
		      .then()
		               .statusCode(200);
		     
	   }
	   

}
