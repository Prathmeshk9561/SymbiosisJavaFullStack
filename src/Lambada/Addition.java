package Lambada;

interface GetNos{
	int add(int x,int y);
}

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetNos ga = (int x,int y) -> {
			return x + y;
		};
		System.out.println(ga.add(23, 450));
	}
}
