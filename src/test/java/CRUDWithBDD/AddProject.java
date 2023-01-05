package CRUDWithBDD;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class AddProject {

	@Test
  public void addFirst() {
		
		baseURI="http://localhost";
		port=8084;
		
		Random ran = new Random();
		int random = ran.nextInt();
		//create json body......
	 JSONObject jsb = new JSONObject();
	 jsb.put("createdBy", "Akash Nath");
	 jsb.put("projectName", "RealmePro4"+random);
	 jsb.put("status", "Ongoing");
	 jsb.put("teamSize", "5");
	 

	 
	 given()
	    .body(jsb).contentType(ContentType.JSON).when().post("/addProject").then()
	       .assertThat().statusCode(201)
	       .log().all();
	 

		
	}
	
	}


