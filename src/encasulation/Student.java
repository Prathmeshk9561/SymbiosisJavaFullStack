package encasulation;
class cred{
	int id;
	String name;
	int roll;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cred c = new cred();
		c.setId(23);
		System.out.println(c.getId());
		c.setName("Prathmesh");
		System.out.println(c.getName());
		c.setRoll(20);
		System.out.println(c.getRoll());
	}
}