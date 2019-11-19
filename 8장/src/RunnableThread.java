
public class RunnableThread implements Runnable {
	String word;

	RunnableThread(String word) {
		this.word = word;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + "  " + word);
				Thread.sleep(500);		//0.5�� ����
			}
			System.out.println("����������" + "  " + word);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		RunnableThread r1 = new RunnableThread("������1");
		RunnableThread r2 = new RunnableThread("������2");
		new Thread(r1).start();
		new Thread(r2).start();
//		Thread Ŭ������ ��ü(r1,r2) �־�� ���������� ������
	}
}
