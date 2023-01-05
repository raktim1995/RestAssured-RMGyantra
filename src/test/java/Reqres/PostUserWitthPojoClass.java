package Reqres;

import org.testng.Assert;
import org.testng.annotations.Test;

import PojoClassWithBDD.PojoClassForReqers;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostUserWitthPojoClass {
	
	@Test
	public void addUser() {
		
		PojoClassForReqers pcf = new PojoClassForReqers("Raktim","BDAPL");
		
		Response rep = given().body(pcf).contentType(ContentType.JSON).
				when().post("https://reqres.in/api/users");
			
		//write jsonpath for using jsonpath valodation
				String actdata=rep.jsonPath().get("job");
				String expected="BDAPL";
				rep.then().log().all();
				Assert.assertEquals(actdata,expected);
		
	}
}
