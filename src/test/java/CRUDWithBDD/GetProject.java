package CRUDWithBDD;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetProject {

public void Getrealme() {
		
		
	 baseURI="http://localhost";
	 port=8084;
		
	given().when().get("/projects/TY_PROJ_1404").then().assertThat().statusCode(200)
	    .contentType("ContentType.JSON")
	     .log().all();
		
		
		
		
}	
}
