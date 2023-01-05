package CRUDWithBDD;


import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProject {

	@Test
    public void projectupdate() {
	baseURI="http://localhost";
	port=8084;
	
	JSONObject jsb = new JSONObject();
	 jsb.put("createdBy", "Roy");
	 jsb.put("projectName", "Poco");
	 jsb.put("status", "Ongoing");
	 jsb.put("teamSize", "5");
	
	 given().body(jsb).contentType(ContentType.JSON).when().put("/projects/TY_PROJ_1804").then().statusLine("HTTP/1.1 200 ").statusCode(200)
	 .log().all();
	
}
}