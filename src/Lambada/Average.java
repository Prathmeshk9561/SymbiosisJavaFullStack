package Lambada;
interface GetAverage{
	double avg(int a,int b,int c,int d);
}
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetAverage ga = (int a,int b,int c,int d) -> {
			return (a+b+c+d)/4;
		};
		System.out.println(ga.avg(223,24,26,28));
	}
	
}