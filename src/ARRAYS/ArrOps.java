package ARRAYS;
import java.util.Scanner;
class ArrayOprations {
	int[][] c = new int[2][3];
	public void ArrSum(int[][] a,int[][] b) {
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] +	b[i][j];		
			}
		}
		System.out.println("Addition of Arrays Is: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");		
			}
			System.out.println();
		}
	}
	public void RevArr() {
		System.out.println("Reversed Array Is: ");
		for(int i=1;i>=0;i--) {
			for(int j=2;j>=0;j--) {
				System.out.print(c[i][j]+" ");		
			}
			System.out.println();
		}
	}
}
public class ArrOps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = new int[2][3];
		int arr2[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values For 1st Array: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr1[i][j] = sc.nextInt();			
			}
		}
		System.out.println("Enter Values For 2nd Array: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr2[i][j] = sc.nextInt();			
			}
		}
		ArrayOprations a = new ArrayOprations();
		a.ArrSum(arr1,arr2);
		a.RevArr();
		sc.close();
	}
}