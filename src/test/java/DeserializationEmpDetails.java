import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeDetailsPojo;

public class DeserializationEmpDetails {
	@Test
 public void deserialization() throws JsonParseException, Throwable, IOException
 {
	 //step1:- create the object for object mapper...
	 ObjectMapper objm = new ObjectMapper();
	 
	 //step2:-raed the value of object mapper...
	 
	EmployeDetailsPojo ep = objm.readValue(new File("./empdata.json"), EmployeDetailsPojo.class);
	 
	//data fetch in console...
	 System.out.println(ep.getAddress());
	 System.out.println(ep.getEid());
	 System.out.println(ep.getEname());
 }

}
