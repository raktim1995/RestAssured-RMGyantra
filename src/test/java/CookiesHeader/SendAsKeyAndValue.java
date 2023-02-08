package CookiesHeader;

import GenericLibrary.BaseClass;
import GenericLibrary.EndPointsLibrary;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SendAsKeyAndValue extends BaseClass {
	
	
	Response res = given()
			.spec(requestSpec)
			.cookie("name","raktim")
			.get(EndPointsLibrary.getSingleProject);

}
