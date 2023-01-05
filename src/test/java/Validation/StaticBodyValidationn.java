package Validation;

//import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StaticBodyValidationn {
	
	@Test
	public void getProject()

	{
//		baseURI="http://localhost";
//		port=8084;
		
		
		String expectedPname="RMG-TYss951";
		Response response = when().get("http://localhost:8084/projects");
		Object actualPname=response.jsonPath().get("[18].projectName");
		Assert.assertEquals(expectedPname,actualPname);
		
	}
}
