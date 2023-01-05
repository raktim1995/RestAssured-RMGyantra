package Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StatusLineValidation {
	@Test
	public void statusline()
	{
		baseURI="http://localhost";
		port=8084;
		
		
		String expstatusline="HTTP/1.1 200 ";
		Response res=when().get("projects");
				res.then().log().all();
		String actualstatusline=res.getStatusLine();
		
		Assert.assertEquals(actualstatusline,expstatusline);
		
	}

}
