
public class Ex08_01 extends Thread {

	int delay;

	Ex08_01(String name, int delay) {
		super(name);
		this.delay = delay;
	}

	public void run() {
		try {

//			while (true) {			
//				sleep(delay);

			for (;;) { // for문에 조건을 안주면 무한반복
				System.out.println(getName() + "  ");
				for (long i = 0; i < delay * 1000000; i++) {
//									delay만 넣으면 간격이 안생김
				}
			}
		} catch (Exception e) {
			System.out.println("error");
			return;
		}
	}

	public static void main(String[] args) {
		ThreadClassE1 t1 = new ThreadClassE1("쓰레드1", 500);
		ThreadClassE1 t2 = new ThreadClassE1("쓰레드2", 700);
		t1.start();
		t2.start();
	}
}
