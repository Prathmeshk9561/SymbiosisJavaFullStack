class xyz {
	int x, y;

	xyz(int a, int b) {

		this.x = a;
		this.y = b;
	}
}

class abc extends xyz {
	int c;

	abc(int a, int b, int j) {
		super(a, b);
		c = a + b + j;
	}

	public void show() {
		System.out.print(c);
	}
}

public class cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc a = new abc(10, 20, 30);
		a.show();
	}
}