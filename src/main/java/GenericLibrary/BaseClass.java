package GenericLibrary;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {
	public JavaUtility jlib = new JavaUtility ();
	public DatabaseUtility dlib = new DatabaseUtility();
	public RestAssuredLibrary  rliib = new RestAssuredLibrary ();
	public ExcelUtility elib = new ExcelUtility();
	public RequestSpecification requestSpec;
	public ResponseSpecification responseSpec;
	
	@BeforeSuite
	public void bsConfig() throws Throwable
	{
		dlib.connectToDB();
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://localhost");
		builder.setPort(8084);
		builder.setContentType(ContentType.JSON);
		requestSpec= builder.build();
	}
	
	@AfterSuite
	public void asConfig() throws Throwable {
		dlib.closedatabase();
		
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		responseSpec = builder.expectContentType(ContentType.JSON).build();
	}

}
