
public class ThreadJoin {
	public static void main(String[] args) {
		JoinImp1 jimp1 = new JoinImp1();
		jimp1.start();
		try {
			jimp1.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~500까지의 합 : " + jimp1.getSum());
		System.out.println("1~500까지 평균 : " + jimp1.getAvg());
	}
}

class JoinImp1 extends Thread {
	private int sum, avg;

	protected int getSum() {
		return sum;
	}

	protected int getAvg() {
		return avg;
	}

	public void run() {
		int count = 0;
		for (int i = 1; i <= 500; i++) {
			sum = sum + i;
			count = count + 1;
		}
		avg = sum / count;
	}
}
