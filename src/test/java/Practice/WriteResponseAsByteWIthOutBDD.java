package Practice;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WriteResponseAsByteWIthOutBDD {
	
	@Test
	public void writeToFile() throws Throwable
	{
		String jsonString = "{\"username\":\"admin\", \"password\" : \"password123\"}";
		
		
	    RequestSpecification request = RestAssured.given();	
	    
	    request.contentType(ContentType.JSON);
	    
	    request.body(jsonString);
	    
	    request.baseUri("https://restful-booker.herokuapp.com/auth");
	    
	    Response response = request.post();
	    
	    byte[] responseAsByte = response.asByteArray();
	    
	    File targfile = new File("src/test/resources/byteWithoutbdd.json");
	    
	    Files.write(responseAsByte, targfile);
	}

}
