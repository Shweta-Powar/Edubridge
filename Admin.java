package employeepackage;

public class Admin {
	int aid;
	String aname;
	String login;
	String password;
	Admin() //No Argument Constructor 
	{
		aid=300;
		aname="mr.Patil";
		login="patil00@gmail.com";
		password="patil";
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aname=" + aname + ", login=" + login + ", password=" + password + "]";
	}

}
