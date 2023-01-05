package Practice;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WriteResponeAsString {
	
	@Test
	public void responsewrite() throws Throwable {
	String jsonString = "{\"username\":\"admin\", \"password\" : \"password123\"}";
	
	//......Create a request specification.......
	
	RequestSpecification request=RestAssured.given();
	
	//Setting content type to specify format in which request payload will be sent.
	// ContentType is an ENUM.
	
	request.contentType(ContentType.JSON);
	
	// Adding URI
	request.baseUri("https://restful-booker.herokuapp.com/auth");
	
	//Adding Body as String....
	request.body(jsonString);
	
	//Calling post method on uri,after getting response
	
	Response response = request.post();
	
	//Getting response as a string and writing in to a file
	
	String responseString = response.asString();
	
	//converting into byte array before Writing.....
	
	byte[] responseAsByte = responseString.getBytes();
	
	//creating a target file.....
	
	File targetFileForString = new File("src/main/resources/targetFileForString.json");
	
	 // Writing into files
	Files.write(responseAsByte, targetFileForString);

}
}