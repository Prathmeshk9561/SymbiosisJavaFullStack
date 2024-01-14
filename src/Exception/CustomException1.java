package Exception;
import java.util.Scanner;
class GetExp extends Exception{
	public GetExp(String s) {
		super(s);
	}
}
public class CustomException1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();
		try {
			if(age<18) {
				throw new GetExp("Unvalid Age Exception");
			}
			else {
				System.out.println("Eligible for Voting");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}