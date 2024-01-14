package AcessSpecifier;

public class Access extends protec{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Default
		Default df = new Default();
		System.out.print(df.r);
		//Public
		Public pb = new Public();
		System.out.print(pb.a);
		
		//Private
//		Private pt = new Private();
//		System.out.print(pt.a);
		 
		//Protected
		protec pr = new protec();
		System.out.print(pr.c );
		

	}

}
