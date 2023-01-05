package Practice;

import java.io.File;
import java.io.InputStream;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WriteResponseWithInput{
	
	@Test
	public void input() throws Throwable
	{
		String jsonString = "{\"username\":\"admin\", \"password\" : \"password123\"}";
		
		  RequestSpecification req=RestAssured.given();
		  
		  req.contentType(ContentType.JSON);
		  req.body(jsonString);
		  req.baseUri("https://restful-booker.herokuapp.com/auth");
		  
		  Response response = req.post();
		  
		  //Getting response as inputStream and write into file.....
		  
		  InputStream respinp = response.asInputStream();
		 
		  //Creating a byte array with number of bytes of inputStream with help of available()method....
		  byte[] respinpbyte = new byte[respinp.available()];
		  
		  //reads number of bytes from the input stream and stores them into the byte..
		  //array responseAsInputStreamByte.
		
		  respinp.read(respinpbyte);
     	  //Creating a target files
		  File targetfile= new File("src/test/resources/inp.json");
		  
		  //Writing into files...
		  Files.write(respinpbyte, targetfile);
		  
		  
	}
}
