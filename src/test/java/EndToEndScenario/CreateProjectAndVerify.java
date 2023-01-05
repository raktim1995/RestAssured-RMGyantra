package EndToEndScenario;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.EndPointsLibrary;
import GenericLibrary.RestAssuredLibrary;
import PojoClassWithBDD.DetailsOfProject;
import io.restassured.response.Response;

public class CreateProjectAndVerify extends BaseClass {
	
	//RestAssuredLibrary rlib = new RestAssuredLibrary();
	
	@Test
	public void projectvalid() throws Throwable {
	//Step1:- create Project using post() 
	
	DetailsOfProject dop = new DetailsOfProject("Sourav","Ty00007","on",5);
	
	
    Response res = given()
    		      .body(dop)
    		      .spec(requestSpec)
    		      
    		      .when().post(EndPointsLibrary.createProject);
    
    //step2:-capture the response and retrive the data 
    
    String expData = rliib.getJsonData(res,"projectId");
    System.out.println(expData);
    
    
    //step3:-connect to database and verify the data
     String query ="select * from project;";
     String actData=dlib.executeQueryAndgetData(query, 1, expData);
     
     System.out.println(actData);
     
     //step4:- validate....
     
     Assert.assertEquals(expData, actData);
    
	 
	
}
}
