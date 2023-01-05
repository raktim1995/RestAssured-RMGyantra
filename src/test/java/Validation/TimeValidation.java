package Validation;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class TimeValidation {
	@Test
	public void timevalid() {
	baseURI="http://localhost";
	port=8084;
	
	when().get("projects")
	.then().assertThat().time(Matchers.lessThan(2000l), TimeUnit.MILLISECONDS);
	}
}
