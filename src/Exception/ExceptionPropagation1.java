package Exception;

public class ExceptionPropagation1 {
	static void get() {
		int arr[] = {23,43,5,65};
		System.out.println(arr[4]);
		throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBound");
	}
	static void show() {
		get();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try{
			show();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
