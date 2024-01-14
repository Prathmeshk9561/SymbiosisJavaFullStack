
public class while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		int n = 15;
		int i = 2;
		while(i<n) {
			if(n%i==0) {
				isPrime = false;
				i++;
				System.out.print(isPrime);
				return;
			}
			
			}
		System.out.print(isPrime);
		}

	}
