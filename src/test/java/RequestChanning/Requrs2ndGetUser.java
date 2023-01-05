package RequestChanning;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Requrs2ndGetUser {
	
	@Test
	public void getuser()
	{
		//step1:- create a pre Request.....
		baseURI="https://reqres.in/";
		
		//step2:-send the request...........
		Response res = when().get("/api/usres");
		
		//step3:- capture the data using json path..
		int id = res.jsonPath().get("data[1].id");
		System.out.println(id);
		
		//step4:-provide the response variable to another request
		when().get("api/users/"+id)
		.then().assertThat().statusCode(200).statusLine("HTTP/1.1 200 OK")
		.log().all();
		
	}

}
