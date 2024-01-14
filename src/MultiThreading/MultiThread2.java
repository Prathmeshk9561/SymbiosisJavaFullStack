package MultiThreading;
class Threading extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Extended Thread "+Thread.currentThread());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Threading2 implements Runnable {
	public void run() {
		for (int i = 0; i < 4; i++) {
			try {
				System.out.println("Implemented Runnable"+Thread.currentThread());
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


public class MultiThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threading t = new Threading();
		Threading t1 = new Threading();
		Threading2 t2 = new Threading2();
		Thread thread = new Thread(t2);
		t.start();
		t1.start();

		thread.start();
		
		
		
		
	}

}
