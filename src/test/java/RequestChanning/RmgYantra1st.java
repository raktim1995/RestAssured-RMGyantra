package RequestChanning;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;
import static org.junit.Assert.assertThat;

import org.testng.annotations.Test;

import PojoClassWithBDD.DetailsOfProject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RmgYantra1st {
	
	@Test
	public void requestchain()
	{
		baseURI="http://localhost";
		port=8084;
		
		//send the pre-request...
	
		DetailsOfProject dop = new DetailsOfProject("tan","mind03","on",9);
		//send the pre-request...
		Response res=given().body(dop).contentType(ContentType.JSON)
		.when().post("/addProject");
		
		//capture the data using jsonpath...
       String pid = res.jsonPath().get("projectId");
        
        System.out.println(pid);
        
        //provide the reference variable to another response....
        given().pathParam("proID", pid)
        .when().get("/projectId/{proID}")
         .then().log().all();
		
	
	}

}
