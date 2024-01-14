
public class Test1 {
		public void team(int x,int y) {
			if(x<18 && y<60) {
				System.out.print("Applicable for sports team");
			}
			else {
				System.out.print("Not applicable for sports team");
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Test1 t1 = new Test1();
			t1.team(21,65);
		}
}