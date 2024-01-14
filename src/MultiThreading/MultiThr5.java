package MultiThreading;

public class MultiThr5 {

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
		
		
		try {
			t2.setPriority(18);	
		}
		catch(IllegalArgumentException e) {
			System.out.println("function SetPriotiy must contain Argument from 1 - 10");
		}
		t1.start();
		t2.start();
	}
}
