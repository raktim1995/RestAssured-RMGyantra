import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeDetailsPojo;
import PojoClassForSerializationAndDeserialization.EmployeDetailsPojowithObject;
import PojoClassForSerializationAndDeserialization.GfClass;

public class GirlFriendDetails {
	@Test
	public void SerializationWithObject() throws Throwable, Throwable, Throwable
	{
		GfClass gf = new GfClass("ZebraCross","TestYantra" ,"Zebra@testyantra", 33335555, "Kathreeguppe");
		EmployeDetailsPojowithObject edp=new EmployeDetailsPojowithObject("Raktim", "Ty1101","raktim@gmail.com" ,222233 ,"Kolkata",gf) ;
		
		ObjectMapper omp = new ObjectMapper();
		omp.writeValue(new File("./empgf.json"), edp);
	}

}
