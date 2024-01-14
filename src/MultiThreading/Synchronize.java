package MultiThreading;
class DemoSync{
	synchronized void getSync() {
			try {
				for (int i = 0; i < 4; i++) {
				System.out.println(i+" "+Thread.currentThread());
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
	}
	}
}
class SyncCall extends Thread {
	DemoSync d;
	public SyncCall(DemoSync d) {
		this.d = d;
	}
	public void run() {
		d.getSync();
	}
}
public class Synchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSync ds = new DemoSync();
		SyncCall sc = new SyncCall(ds);
		sc.start();
		SyncCall sc1 = new SyncCall(ds);
		sc1.start();
	}

}
