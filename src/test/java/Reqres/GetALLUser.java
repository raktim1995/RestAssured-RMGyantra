package Reqres;

import org.apache.commons.lang3.Validate;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetALLUser {
	
	@Test
	public void postAllUser() 
	{
	  // baseURI="https://reqres.in/";
	   
	   Response res = get("https://reqres.in/api/unknown");
	   
	   ValidatableResponse val = res.then();
	   val.statusLine("HTTP/1.1 200 OK").log().all();
	}

}
