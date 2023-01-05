package EndToEndScenario;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.EndPointsLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetSingleProj extends BaseClass {
	
	@Test
	public void getSingleproject() throws Throwable, Throwable
	{
		String proId= elib.readDataIntoExcel("Sheet1", 0, 1);
		
		
		given()
		.spec(requestSpec)
		.pathParam("id",proId)
		
		.when().get(EndPointsLibrary.getSingleProject+"{id}")
		.then()
		    .assertThat()
		       .contentType(ContentType.JSON)
		       .statusCode(200)
		       .log().all();
	}

}
