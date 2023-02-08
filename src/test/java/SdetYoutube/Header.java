package SdetYoutube;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;
//import okhttp3.Headers;

public class Header {
	
	@Test
	public void getHeaders()
	{
		Response re = given()
				.when()
				.get("https://www.google.com/");
		
		Headers allheaders = re.getHeaders();
		
		for(io.restassured.http.Header hd:allheaders)
		{
			System.out.println(hd.getName());
		}
				
	}

}
