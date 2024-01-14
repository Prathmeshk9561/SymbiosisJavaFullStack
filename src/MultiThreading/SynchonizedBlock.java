package MultiThreading;
class DemoSyncBlock{
	void getSync() {
			System.out.println("External "+Thread.currentThread());
		synchronized (this) {
			try {
					for (int i = 0; i < 4; i++) {
					System.out.println(i+"Internal "+Thread.currentThread());
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class SyncCallBlock extends Thread {
	DemoSyncBlock d;
	public SyncCallBlock(DemoSyncBlock d) {
		this.d = d;
	}
	public void run() {
		d.getSync();
	}
}
public class SynchonizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoSyncBlock dc = new DemoSyncBlock();
		SyncCallBlock sb = new SyncCallBlock(dc);
		sb.start();
		SyncCallBlock sb1 = new SyncCallBlock(dc);
		sb1.start();

	}

}
