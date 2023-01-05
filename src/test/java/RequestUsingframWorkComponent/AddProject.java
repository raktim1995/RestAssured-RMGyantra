package RequestUsingframWorkComponent;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.EndPointsLibrary;
import PojoClassWithBDD.DetailsOfProject;
import static io.restassured.RestAssured.*;

public class AddProject extends BaseClass {

	@Test
	public void addProject()
	{
		DetailsOfProject dop = new DetailsOfProject("Chaitra","Ty0021","on",5);
		
		given()
		.spec(requestSpec)
		.body(dop)
		
		.when()
		.post(EndPointsLibrary.createProject)
		
		.then().assertThat()
		//.spec(responseSpec)
		.statusCode(201)
		.log().all();
		
		
	}
}
