package SdetYoutube;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetAllCookies {
	
	@Test
	public void getcookies()
	{
		Response res= given()
				
		.when().get("https://www.google.com/");
		
		Map<String, String> allcookies = res.getCookies();
		//System.out.println(allcookies.keySet());
		for(String k:allcookies.keySet())
		{
			String cookie_value=res.getCookie(k);
			System.out.println(k+"--->"+cookie_value);
		}
	}

}
