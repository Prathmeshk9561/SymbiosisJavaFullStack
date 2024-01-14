package Exception;
public class ExcepPropagation {
	static void get() {
		int arr[] = {23,43,5,65};
		System.out.println(arr[4]);
	}
	static void show() {
		get();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			show();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}