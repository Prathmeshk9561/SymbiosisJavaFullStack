class pqr{
	int p;
	String q;
	pqr q1;
	pqr(int x,String s){
		this.p = x;
		this.q = s;
	}

	pqr(pqr p){
		q1 = p;
		System.out.println(q1.p);
		System.out.print(q1.q);
	}
}
public class ParaConst {

	public static void main(String[] args) {
		pqr p = new pqr(12,"abc");
		pqr p1 = new pqr(p);
	}
}