package WrapperClass;

public class WrapInt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p = 23;
		Integer in = p; //AutoBoxing
		System.out.println(in);
		
		Integer i = 20; //Un-Boxing
		int j = Integer.valueOf(i);
		System.out.println(i+" "+j);

	}

}
