package Practice;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.http.ContentType;

public class WriteResponeAsStringWithBdd {
	
	
	@Test
	public void writedata() throws Throwable
	
	{
		String jsonString = "{\"username\":\"admin\", \"password\" : \"password123\"}";
		
	 byte[] rep = given().body(jsonString)
		.contentType(ContentType.JSON)
		.baseUri("https://restful-booker.herokuapp.com/auth")
		
		.when().post()
		
		.then().extract().response().asString().getBytes();
		
		File targetFile= new File("src/test/resources/bddstring.json");
		
		Files.write(rep, targetFile);
	}

}
