//Ex08_03
public class ThreadClassEx extends Thread {
	int delay;

	ThreadClassEx(String name, int delay) {
		super(name);
		this.delay = delay;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(getName());
				sleep(delay);
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		ThreadClassEx t1 = new ThreadClassEx("쓰레드1", 300);
		ThreadClassEx t2 = new ThreadClassEx("쓰레드2", 800);
		ThreadClassEx t3 = new ThreadClassEx("쓰레드3", 400);
		t1.start();
		t2.start();
		t3.start();
	}

}
