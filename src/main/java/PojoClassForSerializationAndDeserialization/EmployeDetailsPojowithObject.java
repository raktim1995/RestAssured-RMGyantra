package PojoClassForSerializationAndDeserialization;

public class EmployeDetailsPojowithObject {
	
	String Ename;
	String Eid;
	String Email;
	int phone;
	String Address;
	Object GfClss;
	
	//create constructor..
	public EmployeDetailsPojowithObject(String ename,String eid,String Email,int phoneno,String address,Object gfc)
	{
		super();
		
		Ename=ename;
		Eid=eid;
		phone=phoneno;
		Address=address;
		GfClss=gfc;
		
	}
	//Setters and getters 
	
	public String getEname()
	{
	  return Ename;
	}
	public String getEid()
	{
		return Eid;
	}
	public String getEmail()
	{
		return Email;
	}
	public int getphone()
	{
		return phone;
	}
	public String getAddress()
	{
		return Address;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public void setEid(String eid) {
		Eid = eid;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void setGfClss(Object gfClss) {
		GfClss = gfClss;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Object getGfClss() {
		return GfClss;
	}

	public void setGfClss(Object[] gfClss) {
		GfClss = gfClss;
	}
	
	
	
	
	
	

}
