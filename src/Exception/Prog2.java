package Exception;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(6/0);
			String s = null;
			System.out.println(s.charAt(6));
			int a[] = {1,3,4};
			System.out.println(a[4]);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Inside Finally ");
		}
	}

}
