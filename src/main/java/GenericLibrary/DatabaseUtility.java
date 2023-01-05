package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;



public class DatabaseUtility {
	
	Connection con = null;
	
	public void connectToDB() throws Throwable
	{
		Driver driver = new Driver();
		//connect to database..
		con= DriverManager.getConnection(IpatthConstant.dburl,IpatthConstant.dbusername,IpatthConstant.dbpassword);
		
	}
		/**
		 * This method is used for execute database
		 * @author RAKTIM
		 * @param query
		 * @param ColumIndex
		 * @param expdata
		 * @throws Throwable 
		 * @throws Throwable
		 */
		
		public String executeQueryAndgetData(String query,int ColumIndex,String expecdata) throws Throwable
		{
			boolean flag=false;
			String data= null;
			
			ResultSet result = con.createStatement().executeQuery(query);
			
			while(result.next())
			{
			   data= result.getString(ColumIndex);
			   if(data.equalsIgnoreCase(expecdata))
			   {
				   flag=true;
				   break;
			   }
			}
			   if(flag)
			   {
				   System.out.println(data+"data is  matching");
				   return expecdata;
			   }else
			   {
				   System.out.println(data+"data is not matching");
				   return "";
			   }
			}
			
		
		
		public void closedatabase() throws Throwable
		{
			con.close();
		}
	}


