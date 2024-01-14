package Strings;

public class String1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name  = "abcdef";
		char c[] = name.toCharArray();
		System.out.println("String to Character Array-");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		int n = c.length - 1;
		for(int i=0;i<c.length/2;i++) {
			char temp = c[i];
			c[i] = c[n-i];
			c[n-i] = temp;
		}
		System.out.println("\nReversed String - ");
		for (int i = 0; i < c.length; i++) {
				System.out.print(c[i]+" ");
		}
	}
}