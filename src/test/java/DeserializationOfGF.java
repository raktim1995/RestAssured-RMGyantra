import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.GfClass;

public class DeserializationOfGF {
	@Test
	public void deserializationGFdetails() throws JsonParseException, Throwable, IOException
	{
		//step1
		ObjectMapper obm = new ObjectMapper();
		
		GfClass gf = obm.readValue(new File("./empgf.json"), GfClass.class);
		System.out.println(gf.getGfCompany());
		System.out.println(gf.getGfName());
		System.out.println(gf.getEmail());
		
	}

}
