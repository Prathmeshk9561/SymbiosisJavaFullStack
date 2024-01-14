public class Switch1 {
	public static int calc(String x,int a,int b) {
		int c=0;
		switch(x){
		case "add":
			c = a + b;
			break;	
		case "sub":
			c = a - b;
			break;
		case "mul":
			c = a * b;
			break;
		case "div":
			c = a / b;
			break;	
		case "mod":
			c = a % b;
			break;	
		default:
			System.out.print("wrong choice");
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = calc("sub",24,12);
		System.out.print(ans);
	}
}