class rec{
	int sum(int a) {
		if(a==0) {
			return 1;
		}
		else {
			return a*sum(a-1);
		}
	}
}
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec r = new rec();
		int s = r.sum(5);
		System.out.print(s);
	}

}
