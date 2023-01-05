package CRUDWithBDD;

import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;

public class Delete1404Project {
	
	@Test
	public void projectdelete()
	{
		baseURI="http://localhost";
		port=8084;
		
		when().delete("/projects/TY_PROJ_1602")
		.then().assertThat().statusCode(200).statusCode(204);
	}

}
