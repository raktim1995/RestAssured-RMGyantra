package Reqres;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetAllResponseValidation {
	
	@Test
	public void Uservalidate()
	{
	baseURI="https://reqres.in/";
	
	Response re = when().get("/api/unknown");
	
	List<Object> actdata = re.jsonPath().get("data");
	
	for(Object d:actdata)
	{
		System.out.println(d.toString());
	}

}
}