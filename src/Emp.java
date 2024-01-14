class employee{
	static String company;
	int emp_id;
	String emp_name;
	static {
		company="JPMorgan";
	}
	employee(){
		emp_id = 232;
		emp_name = "Prathmesh";
	}
	employee(int x,String a){
		emp_id = x;
		emp_name = a;
	}
	void assign() {
		emp_id = 344;
		emp_name = "Juned";
	}
	void display() {
		System.out.println(company+" "+emp_id+" "+emp_name);
	}
}
public class Emp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e = new employee();
		employee e1 = new employee(244,"Omkar");
		employee e2 = new employee();
		e.display();
		e1.display();
		e2.assign();
		e2.display();
	}
}