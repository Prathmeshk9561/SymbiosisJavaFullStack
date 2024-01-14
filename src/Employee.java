
public class Employee {
	
	int empid;
	String emp_name;
	Employee(int empid, String emp_name)
	{
		this.empid=empid;
		this.emp_name=emp_name;
		
	}
	public static void main(String args[])
	{
		Employee e = new Employee(10,"Sanket");
		System.out.println(e.empid + e.emp_name);
		
	}
}
