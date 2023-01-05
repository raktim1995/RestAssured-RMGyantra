package CRUDWithBDD;

import static io.restassured.RestAssured.*;


public class GetAllProject {
	
   public void getallproj() {
	baseURI="http://localhost";
	 port=8084;
	
	when().get("./projects").then().assertThat().log().all();
	 
   }
}
