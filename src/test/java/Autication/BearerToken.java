package Autication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken {

	@Test
	public void gitauth()
	{
		baseURI="https://api.github.com";
		
		
		JSONObject js = new JSONObject();
		js.put("name", "FirstApiRepo");
		
		
		given().auth().oauth2("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")
		.body(js).contentType(ContentType.JSON)
		
		.when().post("/user/repos")
		
		.then().assertThat().statusCode(201).log().all();
	}
}
