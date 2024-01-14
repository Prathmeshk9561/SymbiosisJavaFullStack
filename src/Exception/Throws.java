package Exception;

public class Throws {
	static void fun() throws ArrayIndexOutOfBoundsException {
		int arr[] = {14,54,56,34,65};
		for (int i = 0; i <= 7; i++) {
			System.out.println(arr[i]);
		}
	}
	static int fun1() throws ArithmeticException {
		System.out.println("Divide by Zero - ");
		int  c = 6/0;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fun();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		
		try{
			fun1();
		}
		catch(ArithmeticException e){
			System.out.println(e+" "+e.getLocalizedMessage());
		}
	}

}
