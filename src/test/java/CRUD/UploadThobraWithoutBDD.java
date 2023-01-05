package CRUD;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UploadThobraWithoutBDD {
	
	
	@Test
	public void uploadmari()
	{
		File file = new File("C:\\Users\\RAKTIM\\Downloads\\jerry-mouse-EK8A3M.jpg");

		RestAssured rest = new RestAssured();
		
		rest.given().multiPart("file",file,"multipart/form-data").post("https://the-internet.herokuapp.com/upload")
		.thenReturn().then().log().all();
	
	}

}
