package SdetYoutube;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Cookie {
	@Test
	public void getCookiesInfo()
	{
		
		Response re = given()
		
		.when().get("https://www.google.com/");
		
		//get single cookie info
		String cookie_value=re.cookie("AEC");
		System.out.println("value of cookie is==>"+cookie_value);
		
	}

}
