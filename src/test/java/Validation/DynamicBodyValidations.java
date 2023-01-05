package Validation;

import static io.restassured.RestAssured.*;
//import static io.restassured.RestAssured.port;
//import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicBodyValidations {
	
	@Test
	public void Bodyvalidation()
	{
		baseURI="http://localhost";
		port=8084;
		
		String expected ="RMG-TYss951";
		Response response=when().get("projects");
		System.out.println(response.then().log().all());
		List<String>actual=response.jsonPath().get("projectId");
		boolean flag = true;
		
		for(String stn:actual)
		{
			if(stn.equalsIgnoreCase(expected))
			{
				System.out.println("Id is found");
				flag=true;	
			}
		}
		Assert.assertTrue(flag);
	}

}
