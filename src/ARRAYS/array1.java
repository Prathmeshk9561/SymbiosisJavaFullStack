package ARRAYS;
import java.util.*;
public class array1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Values for Array: ");
		int[] a = new int[5];
		int b[] = new int[5];
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("Copied Array is: ");
		for(int i = 0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}