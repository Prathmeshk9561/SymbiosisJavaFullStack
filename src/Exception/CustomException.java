package Exception;
import java.util.Scanner;
// Custom Exception
class CustExcep extends Exception{
	public CustExcep(String str) {
		super(str);
	}
}
public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age = sc.nextInt();
		System.out.print("Enter Gender: ");
		String gen = sc.next();
		// TODO Auto-generated method stub
		try {
			if(age<21 && gen.equalsIgnoreCase("male") || age<18 && gen.equalsIgnoreCase("female")) {
				throw new CustExcep("InvalidAgeException");
			}
			else {
				System.out.println("Eligible for Marriage");
			}
		}
		catch(CustExcep e) {
			System.out.println(e.getMessage());
		}
	}
}