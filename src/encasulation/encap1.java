package encasulation;
class store{
	int id;
	String prod;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProd() {
		return prod;
	}
	public void setProd(String prod) {
		this.prod = prod;
	}
	public void display() {
		System.out.println(id);
		System.out.println(prod);
	}
}
public class encap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		store s = new store();
		s.setId(12);
		s.setProd("biscuit");
		s.getId();
		s.getProd();
		s.display();
	}
}