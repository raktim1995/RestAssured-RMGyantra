package Reqres;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostUserUsingJSB {
	
	@Test
	public void postuser()
	{
		baseURI="https://reqres.in/";
		
			
		
		JSONObject jsb = new JSONObject();
		jsb.put("name", "Tanmoy");
		jsb.put("job", "Concentrix");
		
		given().body(jsb).contentType(ContentType.JSON)
		
		.when().post("/api/users").
		
		then().assertThat().statusCode(201)
		.log().all();
		
	}

}
