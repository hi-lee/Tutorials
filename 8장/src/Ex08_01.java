
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

			for (;;) { // for���� ������ ���ָ� ���ѹݺ�
				System.out.println(getName() + "  ");
				for (long i = 0; i < delay * 1000000; i++) {
//									delay�� ������ ������ �Ȼ���
				}
			}
		} catch (Exception e) {
			System.out.println("error");
			return;
		}
	}

	public static void main(String[] args) {
		ThreadClassE1 t1 = new ThreadClassE1("������1", 500);
		ThreadClassE1 t2 = new ThreadClassE1("������2", 700);
		t1.start();
		t2.start();
	}
}
