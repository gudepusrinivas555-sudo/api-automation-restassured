package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import base.BaseTest;

public class DeleteUserTest extends BaseTest {
	   
	   @Test
	   public void DeleteUser() {
		     
		     given()
		     .when()
		              .delete("/api/user/")
		     .then()
		              .statusCode(2004);
	   }
	

}
