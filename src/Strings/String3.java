package Strings;

public class String3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s = "CHORAGE";
		
		s.concat("FHFHF");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("PQR");
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer(sb);
		System.out.println(sb.equals(sb1));
	}

}
