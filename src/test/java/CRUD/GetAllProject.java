package CRUD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProject {
	@Test
	public void Getrealme() {
		
		//step1:- Create pre-request...
		
		//step2:- send the request...
		 Response resp = get("http://localhost:8084/projects/TY_PROJ_1402");
		
		//setp3:- validate the response...
		
		ValidatableResponse val = resp.then();
		val.log().all();
		
		
	}

}
