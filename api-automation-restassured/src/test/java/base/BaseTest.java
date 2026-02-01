package base;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseTest {
	   
	   @BeforeMethod
	   public void setup() {
		      RestAssured.baseURI =	 "https://www.reqres.com";
	   }
}