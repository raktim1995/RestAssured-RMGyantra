package Practice;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.http.ContentType;

public class WriteResponseAsByte {

	@Test
	public void writedata() throws Throwable
	{
		String jsonString = "{\"username\":\"admin\", \"password\" : \"password123\"}";
		
		byte[] response=given().body(jsonString).contentType(ContentType.JSON)
		.baseUri("https://restful-booker.herokuapp.com/auth")
		.when().post()
		.then().extract().response().asByteArray();
		
		//creating a target file.....
		File targetFileForByte = new File("src/test/resources/bytefile.json");
		
		// Writing into files
		Files.write(response, targetFileForByte);
		
	}
	
}
