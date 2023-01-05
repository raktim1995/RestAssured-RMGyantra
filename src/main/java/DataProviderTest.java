import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider
	public Object[][] DataBody()
	{
		Object [][] obj = new Object[2][4];
		obj [0][0]="Amrutha";
		obj [0][1]="Kerala";
		obj [0][2]="ON";
		obj [0][3]= 6;
		obj[1][0]="Kalpana";
		obj[1][1]="RMG-TYss951";
		obj[1][2]="Created";
		obj[1][3]=12;
		return obj;
	}

}
