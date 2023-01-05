package Autication;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DigestAuth {
	@Test
	public void authdigest()
	{
		baseURI="http://localhost";
		port=8084;
		
		
		given().auth().digest("rmgyantra", "rmgy@9999")
		.when().get("/login")
		.then().assertThat().log().all();
		
	}

}
