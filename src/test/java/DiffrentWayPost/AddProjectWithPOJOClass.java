package DiffrentWayPost;

import PojoClassWithBDD.DetailsOfProject;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class AddProjectWithPOJOClass {

	@Test
	public void projectadd() {
		
		baseURI="http://localhost";
		port=8084;
		
		DetailsOfProject dop = new DetailsOfProject("Arun","Asus","Active",4);
		
		given().body(dop).contentType(ContentType.JSON).
		
		when().post("/addProject")
		
		.then().assertThat().contentType(ContentType.JSON).statusCode(201).statusLine("HTTP/1.1 201 ")
		.log().all();
	}
}
