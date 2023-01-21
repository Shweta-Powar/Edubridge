package departmentpackage;

public class Department {
	int id;
	String name;
	String add;
public	Department() //No Argument Constructor 
	{
		id=400;
		name="Manegment";
		add="Mumbai";
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

}
