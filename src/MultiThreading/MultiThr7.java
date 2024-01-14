package MultiThreading;
class GroupThread implements Runnable{
	public void run() {
			try { 
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
				Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
public class MultiThr7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg = new ThreadGroup("Thread_Group");
		
		GroupThread gt1 = new GroupThread();
		GroupThread gt2 = new GroupThread();
		
		Thread t1 = new Thread(tg,gt1,"Thread1");
		Thread t2 = new Thread(tg,gt2,"Thread1");
		t1.start();
		t2.start();
		
		tg.destroy();
		System.out.println(tg.getParent());
	}

}
