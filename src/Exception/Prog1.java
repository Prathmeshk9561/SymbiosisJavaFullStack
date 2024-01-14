package Exception;

public class Prog1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,5};
		String s = null;
		try {
			System.out.println(a[3]);
			System.out.println(s.charAt(5));			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}