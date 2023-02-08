package SdetYoutube;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Parameters {

	@Test
	public void param()
	{
	baseURI="https://reqres.in/api/";
	
	given()
	  .pathParam("path","users")
	  .queryParam("page", 2)
	  .queryParam("id", 5)
	  
	.when()
	.get("{path}")
	
	.then()
	.statusCode(200)
	.log().all();
 
	}
}
