package employeepackage;

public class Manager {
	int mid;
	String mname;
	String maddress;
	float msalary;
	Manager() //No Argument Constructor 
	{
		mid=200;
		mname="Mr.Shinde";
		maddress="Nashik";
		msalary=50.25f;
	}
	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", mname=" + mname + ", maddress=" + maddress + ", msalary=" + msalary + "]";
	}
	
}
