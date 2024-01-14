package Exception;

import java.io.IOException;
public class ThrowKeyword {
	static void fun() {
		try {
			throw new IOException("Throwing a IOException");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}
}