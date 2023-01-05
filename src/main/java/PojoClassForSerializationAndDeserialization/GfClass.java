package PojoClassForSerializationAndDeserialization;

public class GfClass {
	
	String GfName;
	String  GfCompany;
	String Email;
	int Phoneno;
	String  Address;
	
	public GfClass(String gfName, String gfCompany, String email, int phoneno, String address) {
		super();
		GfName = gfName;
		GfCompany = gfCompany;
		Email = email;
		Phoneno = phoneno;
		Address = address;
	}
	
	public GfClass()
	{
		
	}

	public String getGfName() {
		return GfName;
	}

	public void setGfName(String gfName) {
		GfName = gfName;
	}

	public String getGfCompany() {
		return GfCompany;
	}

	public void setGfCompany(String gfCompany) {
		GfCompany = gfCompany;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhoneno() {
		return Phoneno;
	}

	public void setPhoneno(int phoneno) {
		Phoneno = phoneno;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
	

}
