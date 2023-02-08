package Autication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Auth2 {

/*Client ID - chickenShop
Client Secret - 3f8de69e94cb3f5ea3a72eaf8489361d
Redirect URI - 	http://example.com
userid-3884

url to generate token - http://coop.apps.symfonycasts.com/token
*/

	@Test
	public void authentication(){
	
		Response res = given().
				 formParam ("client_id", "MID")
				.formParam("client_secret","7f87e3e3202ee7827c82d0e4482d22b0")
				.formParam("grant_type","client_credentials")
				.formParam("redirect_uri","https://westbngl.com")
				.formParam("code","authorization_code").
				
				when().post("http://coop.apps.symfonycasts.com/token");
		
		System.out.println(res);
		
		String token=res.jsonPath().getString("access_token");
		
		System.out.println(token);
		
		given().auth().oauth2(token)
		.pathParam("userId",4157)
		
		.when().post("http://coop.apps.symfonycasts.com/api/{userId}/barn-unlock")
		.then().log().all();
	}
}
