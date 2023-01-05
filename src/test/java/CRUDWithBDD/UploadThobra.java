package CRUDWithBDD;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class UploadThobra {
	
	
	@Test
	public void uploadmari()
	{
		File file = new File("C:\\Users\\RAKTIM\\Downloads\\jerry-mouse-EK8A3M.jpg");

		given().multiPart("file",file,"multipart/form-data").post("https://the-internet.herokuapp.com/upload")
		.thenReturn().then().log().all();
	
	}

}
