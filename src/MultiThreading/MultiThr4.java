package MultiThreading;
public class MultiThr4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->{
			try {
				for (int i = 0; i < 10; i++) {
					if(i%2==0) {
						System.out.println("Even Nos: "+i+" "+Thread.currentThread());
				Thread.sleep(2000);
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		},"Even Thread");
		Thread t2 = new Thread(()->{
			try {
				for (int i = 0; i < 10; i++) {
					if(i%2!=0) {
						System.out.println("Odd Nos: "+i+" "+Thread.currentThread());
				Thread.sleep(2000);
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		},"Odd Thread");		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
	}
}