package MultiThreading;
class DemoSyncBlock1{
	synchronized void getSync(int x) {
			try {
					for (int i = 1; i <= 10; i++) {
					System.out.println((i*x)+" "+Thread.currentThread());
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				// TODO: handle exception
			} 
	}
}
class SyncCallBlock1 extends Thread {
	DemoSyncBlock1 d;
	int x;
	public SyncCallBlock1(DemoSyncBlock1 d,int x) {
		this.d = d;
		this.x = x;
	}
	public void run() {
		d.getSync(x);
	}
}

public class Synchronization1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSyncBlock1 dc = new DemoSyncBlock1();
		
		SyncCallBlock1 sb = new SyncCallBlock1(dc,1);
		SyncCallBlock1 sb2 = new SyncCallBlock1(dc,10);
		SyncCallBlock1 sb3 = new SyncCallBlock1(dc,100);
		sb.start();
		sb2.start();
		sb3.start();
		
		
	}
}
