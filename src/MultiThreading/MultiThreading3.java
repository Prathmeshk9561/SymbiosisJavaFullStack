package MultiThreading;
public class MultiThreading3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(() ->{
				try {
					for (int i = 0; i < 5; i++) {
						System.out.println(i+" "+Thread.currentThread());
						Thread.sleep(2000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		},"Thread1");
		
		Thread t1 = new Thread(() ->{
				try {
					for (int i = 0; i < 5; i++) {
						System.out.println(i+" "+Thread.currentThread());
						Thread.sleep(2000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		},"Thread2");
		
		t.start();
		t1.start();
	}
}