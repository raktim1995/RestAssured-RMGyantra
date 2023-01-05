import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClassForSerializationAndDeserialization.EmployeDetailsPojoArray;
import PojoClassForSerializationAndDeserialization.GfClass;

public class SerializationWithArray {
	
	@Test
	public void serializationArray() throws Throwable, Throwable, IOException {
		String[] Email = {"raktim@gmail.com", "raktimmondal@gmail.com"};
		int[] phoneno= {666666,888888};
		
		GfClass gf = new GfClass("Girlfriend2","TestYantra" ,"Zebra@testyantra", 3335555, "Kathreeguppe");

		EmployeDetailsPojoArray eda = new EmployeDetailsPojoArray("mondal","TYR000",Email,phoneno,"Khargpur",gf);
		System.out.println(eda);
		ObjectMapper oma = new ObjectMapper();
		oma.writeValue(new File("./empSecond.json"), eda);
		
}
}
