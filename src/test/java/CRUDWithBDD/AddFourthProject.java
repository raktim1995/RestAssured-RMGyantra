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


public class AddFourthProject {

	@Test
  public void addFirst() {
		
		baseURI="http://localhost";
		port=8084;
		
		Random ran = new Random();
		int random = ran.nextInt();
		//create json body......
	 JSONObject jsb = new JSONObject();
	 jsb.put("createdBy", "Prat");
	 jsb.put("projectName", "RedmiK20"+random);


	 
	 given()
	    .body(jsb).contentType(ContentType.JSON).when().post("/addProject").then()
	       .assertThat().statusCode(201)
	       .log().all();
	 

		
	}
	
	}


