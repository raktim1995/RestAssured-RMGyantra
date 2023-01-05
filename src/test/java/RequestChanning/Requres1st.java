package RequestChanning;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Requres1st {

	@Test
	public void requestchain()
	{
	//step1:-create pre request
		baseURI="https://reqres.in/";
		
	//step2:-send the request
		Response res=when().get("/api/users");
		
	//step3:- Capture the response using json path
		int id=res.jsonPath().get("data[2].id");
		System.out.println(id);
		
	//step4:- Provide the response variable to another response
		when().delete("/api/users"+id)
		.then().assertThat().statusCode(204)
		.log().all();
		
	}

}
