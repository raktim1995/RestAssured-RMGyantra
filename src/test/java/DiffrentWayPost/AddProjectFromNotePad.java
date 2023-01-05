package DiffrentWayPost;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class AddProjectFromNotePad {

	
	@Test
	public void datadriven() {
		

		baseURI="http://localhost";
		port=8084;
	File src = new File("\\src\\test\\resources\\projectRest.txt");
	
	given().body(src).contentType(ContentType.JSON)
	.when().post("/addProject").then().assertThat().statusCode(201).log().all();
	}
}
