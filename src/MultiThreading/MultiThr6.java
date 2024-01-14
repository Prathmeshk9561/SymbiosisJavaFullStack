package MultiThreading;

public class MultiThr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->{
			try {
				for (int i = 1; i <= 10; i++) {
					if(i%2==0) {
						System.out.println("Even Nos: "+i+" "+Thread.currentThread());
				Thread.sleep(2000);
					}
				}
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		},"Even Thread");
		t1.setPriority(10);
		
		Thread t2 = new Thread(()->{
			try {
				for (int i = 1; i <= 10; i++) {
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
		
		Thread t3 = new Thread(()->{
			try {
				for (int i = 1; i <= 10; i++) {
				System.out.println("Natural Nos: "+i+" "+Thread.currentThread());
				Thread.sleep(2000);
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		},"Natural No Thread");
		
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		}
		catch(Exception e) {
			
		}
		
		

	}

}
