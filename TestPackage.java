package employeepackage;
import departmentpackage.Department;
import departmentpackage.Project;
public class TestPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(); //Calling Employee class Const
		System.out.println(employee);
		
		Manager manager=new Manager();//Calling Manager class Const
		System.out.println(manager);
		
		Admin admin=new Admin();//Calling Admin class const
		System.out.println(admin);
		
		Department department=new Department();//Calling Manager class Const
		System.out.println(department);
		
		Project project=new Project();//Calling Project class Const
		System.out.println(project);


	}

}
