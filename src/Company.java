class Google{
	int id;
	String name;
	public Google(int id,String name) {
		this.id = id;
		this.name = name;
	}
	void show() {
		System.out.println(id);
		System.out.println(name);
	}
}
class Product extends Google{
	String ProdName;
	Product(int n,String s,String ProdName) {
		super(n,s);
		this.ProdName = ProdName;
	}
	void show() {
		super.show();
		System.out.println(ProdName);
	}
}
public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product(343,"Google","Google Drive");
		p.show();	
	}
}
