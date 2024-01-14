class Microsoft{
	int id;
	String CompName;
	public Microsoft(int id,String CompName) {
		this.id = id;
		this.CompName = CompName;
	}
	void show() {
		System.out.println(id);
		System.out.println(CompName);
	}
}
class Azure extends Microsoft{
	String ProdName;
	public Azure(int id, String CompName,String ProdName) {
		super(id, CompName);
		this.ProdName = ProdName;
		super.show();
	}
	void show() {
		System.out.println(ProdName);
	}
}
public class Company1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Azure a = new Azure(3123, "Microsoft Azure", "Azure Cloud");
		a.show();
	}
}