class parent{
	String s;
	public parent() {
		s = "Parent Class";
	}
	public void getData(int x, String a) {
		System.out.println(s+" "+x+" "+a);
	}
}
class child extends parent{
	String s;
	public child() {
		super();
		s = "Child Class";
		super.getData(23, "Hello");
	}
	public void getData(int x, String a) {
		System.out.println(s+" "+x+" "+a);
	}
}
public class fun_overriding {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		parent p = new child();
  		p.getData(23, "Hello");
	}

}