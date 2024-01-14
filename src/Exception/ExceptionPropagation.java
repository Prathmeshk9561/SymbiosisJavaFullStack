package Exception;
import java.io.*;
public class ExceptionPropagation {
	static void get() throws IOException {
		int arr[] = {23,43,5,65};
		System.out.println(arr[3]);
		throw new IOException("IOException Occured");
	}
	static void show() throws IOException {
		get();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			show();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}