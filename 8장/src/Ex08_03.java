class Account1 {
	private int tot = 1000000;

	synchronized void deposit(int amt) {
		if (tot >= amt) {
			tot -= amt;
			System.out.println("9800원을 인출, 남은 잔액 : " + tot); 
//			synchronized걸어주면 한쓰레드가 끝날때까지 다른쓰레드 접근X -> 1개씩만 출력(겹치지 않게 출력해야함)
//			 총액이 9800원 이하면 - 값 나오기때문에 '총액>=amt' 조건 걸어줘야함
		}
	}

	int gettot() {
		return tot;
	}
}

class Customer1 extends Thread {
	Account1 acc2;

	Customer1(Account1 acc) {
		this.acc2 = acc;
	}

	public void run() {
		try {
			for (int i = 0; i < 300; i++) {
				acc2.deposit(9800);
				sleep(50);

				if (acc2.gettot() < 9800)
					break;

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}	
}

public class Ex08_03 {
	public static void main(String[] args) {
		Account1 acc = new Account1();
		Customer1 cust[] = new Customer1[4];
		for (int i = 0; i < 4; i++) {
			cust[i] = new Customer1(acc);
			cust[i].start();
		}
		for (int i = 0; i < 4; i++) {
			try {
				cust[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("잔액부족, 현재잔액 : " + acc.gettot() + ", 인출금액 : 9800");
		System.out.println("총액은 : " + acc.gettot());
	}

}
