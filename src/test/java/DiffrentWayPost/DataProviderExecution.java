package DiffrentWayPost;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoClassWithBDD.DetailsOfProject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DataProviderExecution {

	
	@DataProvider
	public Object[][] DataBody()
	{
		baseURI="http://localhost";
		port=8084;
		
		
		Object [][] obj = new Object[2][4];
		obj [0][0]="Amrutha";
		obj [0][1]="Kerala";
		obj [0][2]="ON";
		obj [0][3]= 6;
		obj[1][0]="Megha";
		obj[1][1]="RMG-TYss951";
		obj[1][2]="Created";
		obj[1][3]=12;
		return obj;
	}

	
	@Test(dataProvider="DataBody")
	public void createproject(String createdBy, String projectName, String status, int teamSize)
	{
		baseURI="http://localhost";
		port=8084;
		DetailsOfProject dpe = new DetailsOfProject(createdBy,projectName,status,teamSize);
		given().contentType(ContentType.JSON).
		when().body(dpe).post("/addProject").
		then().statusCode(201).log().all();
		
	}
}
