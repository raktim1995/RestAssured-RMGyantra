package CRUDWithBDD;

import static io.restassured.RestAssured.DEFAULT_PATH;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddSecondProject {
	@Test
	public void secondBddProject() {
		

		baseURI="http://localhost";
		port=8084;
	Random ran= new Random();
	int random= ran.nextInt();
	
	
	JSONObject jsb = new JSONObject();
	jsb.put("createdBy","Tanmoy Roy"+random);
	jsb.put("projectName","OldMonk");
	jsb.put("status","2nd peg" );
	jsb.put("teamSize", "1");
	
	
	given().body(jsb).contentType(ContentType.JSON).when().post("/addProject").then()
	.assertThat().statusCode(201)
	   .log().all();
	}
}
