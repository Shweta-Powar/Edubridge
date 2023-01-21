package employeepackage;

public class Employee {
	int eid;
	String ename;
	String address;
	float salary;
	Employee() //No Argument Constructor 
	{
		eid=100;
		ename="Sagar Kadam";
		address="Satara";
		salary=25.33f;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", salary=" + salary + "]";
	}
	
}
