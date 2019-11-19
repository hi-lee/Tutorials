class Account {
	private int tot = 0;

	synchronized void deposit(int amt) {
		tot += amt;
	}

	int gettot() {
		return tot;
	}
}

class Customer extends Thread {
	Account accl;

	Customer(Account acc) {
		this.accl = acc;
	}

	public void run() {
		try {
			for (int i = 0; i < 300; i++) {
				System.out.println("쓰레드 " + getName() + " : " + i + "번째");
				accl.deposit(1000);
				sleep(50);
				if (accl.gettot() >= 1000000)
					break;	//총합이 1000000넘으면 for문 빠져나옴
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class ContributionCount {
	public static void main(String[] args) {
		Account acc = new Account();
		Customer cust[] = new Customer[10]; //배열 10개 생성
		for (int i = 0; i < 10; i++) {
			cust[i] = new Customer(acc); //Customer에서 Account 공유 -> 생성된 배열10개에 acc넣어줌 
			cust[i].start();
		}
		for (int i = 0; i < 10; i++) {
			try {
				cust[i].join();	//join이 없으면 종료전 값이 나오기때문에 넣어줘야 총액이 제대로 나옴
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("총액은 : " + acc.gettot());
	}
}
