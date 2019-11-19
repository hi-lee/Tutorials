package algorithm;

public class PerfectNum {
	private int round;

	public PerfectNum() {

	}

	public PerfectNum(int round) {	//���� ����
		this.round = round;
	}

	public void setBand(int round) {
		this.round = round;
	}

	public int perfect() {
		int cnt = 0;
		for (int i = 2; i <= round; i++) {	
			int sum = 0;
			for (int j = 1; j <= (i/2); j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				cnt++;
				System.out.println(i + "   ");
			}
		}
//		System.out.println("�������� ���� : " + cnt);
		return cnt; //return�� �ֱ⶧���� class�� void ������
	}

}
