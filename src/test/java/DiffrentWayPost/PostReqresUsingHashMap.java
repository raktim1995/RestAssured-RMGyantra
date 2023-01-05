package DiffrentWayPost;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostReqresUsingHashMap {
	
	
	@Test
	public void createuser() {
		HashMap hsm = new HashMap();
		hsm.put("name", "Akash");
		hsm.put("job", "laundya baaz");
		
		given().body(hsm).contentType(ContentType.JSON).
		
		when().post("https://reqres.in/api/users?page=2")
		
		.then().assertThat().statusCode(201);
	}

}
