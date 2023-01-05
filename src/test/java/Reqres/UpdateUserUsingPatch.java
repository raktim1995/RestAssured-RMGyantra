package Reqres;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateUserUsingPatch {

	    @Test
		public void patchupdate()
		{
	    	baseURI="https://reqres.in/";
	    	
			HashMap hm = new HashMap();
			hm.put("name", "Tanmoy");
			hm.put("job", "Mindtree");
			
			given().body(hm).contentType(ContentType.JSON)
			.when().patch("/api/users/2")
			.then().assertThat().time(Matchers.lessThan(2000l),TimeUnit.MILLISECONDS);
		}

	}


