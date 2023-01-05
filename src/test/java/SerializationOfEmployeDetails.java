import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeDetailsPojo;

public class SerializationOfEmployeDetails {
@Test
	public void serializationEmpDetails() throws Throwable, JsonMappingException, IOException
	{
		EmployeDetailsPojo edp=new EmployeDetailsPojo("Raktim", "Ty1101","raktim@gmail.com" ,222233 ,"Kolkata") ;
		ObjectMapper om = new ObjectMapper();
		om.writeValue(new File("./empdata.json"),edp);
	}
	
	}


