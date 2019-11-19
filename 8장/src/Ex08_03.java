class Account1 {
	private int tot = 1000000;

	synchronized void deposit(int amt) {
		if (tot >= amt) {
			tot -= amt;
			System.out.println("9800���� ����, ���� �ܾ� : " + tot); 
//			synchronized�ɾ��ָ� �Ѿ����尡 ���������� �ٸ������� ����X -> 1������ ���(��ġ�� �ʰ� ����ؾ���)
//			 �Ѿ��� 9800�� ���ϸ� - �� �����⶧���� '�Ѿ�>=amt' ���� �ɾ������
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
		System.out.println("�ܾ׺���, �����ܾ� : " + acc.gettot() + ", ����ݾ� : 9800");
		System.out.println("�Ѿ��� : " + acc.gettot());
	}

}
