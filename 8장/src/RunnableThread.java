
public class RunnableThread implements Runnable {
	String word;

	RunnableThread(String word) {
		this.word = word;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i + "  " + word);
				Thread.sleep(500);		//0.5초 지연
			}
			System.out.println("쓰레드종료" + "  " + word);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		RunnableThread r1 = new RunnableThread("쓰레드1");
		RunnableThread r2 = new RunnableThread("쓰레드2");
		new Thread(r1).start();
		new Thread(r2).start();
//		Thread 클래스에 객체(r1,r2) 넣어야 정상적으로 동작함
	}
}
