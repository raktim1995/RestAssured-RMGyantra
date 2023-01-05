package DiffrentWayPost;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class HashMapTestYantraApi {

	@Test
	public void addProject()
	{
		baseURI="http://localhost";
		port=8084;
		
		HashMap hm = new HashMap();
		hm.put("cratedBy", "vivek");
		hm.put("projectName", "Maysore");
		hm.put("status", "active");
		hm.put("teamsize", 5);
		
		
		given().body(hm).contentType(ContentType.JSON)
		.when().post("/addProject").
		then().assertThat().statusCode(201).log().all();
	 
	}
	
}
