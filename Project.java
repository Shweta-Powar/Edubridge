package departmentpackage;

public class Project {
	int pid;
	String pname;
public	Project() //No Argument Constructor 
	{
		pid=500;
		pname="Bank Manegment";
		
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + "]";
	}

}
