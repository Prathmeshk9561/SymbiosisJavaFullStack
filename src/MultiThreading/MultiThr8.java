package MultiThreading;

class Clock implements Runnable{
	
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class MultiThr8 {

	public static void main(String[] args) {
//		MultiThr8 m = new MultiThr8();
//		Thread t = new Thread(m);
//		t.start();
		// TODO Auto-generated method stub
		Runnable r = (() ->{
			try {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		);
		r.run();
	}

}
