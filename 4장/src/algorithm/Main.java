package algorithm;

import java.io.*;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		int menuNum = 0;
		char ans = 0; // BufferedReader�� String���� �Է¹���
		Mabang mb;
		BinarySearch bs;
		PerfectNum pn;
		int su, cnt = 0;
		while (true) {
			System.out.println("****�޴�****");
			System.out.println("1.�����˻�");
			System.out.println("2. ������");
			System.out.println("3. ������");
			System.out.println("6. ����");
			System.out.print("�۾��� �����ϼ��� :");

			menuNum = Integer.parseInt(inbr.readLine());

			if (menuNum == 1) {
				System.out.print("ã���� �ϴ� ���� �Է��ϼ���(1~100) : ");
				int k = Integer.parseInt(inbr.readLine());
				bs = new BinarySearch(k);
				bs.bSearch();
			} else if (menuNum == 2) {
				int size = 5;
				while (true) {
					System.out.println("�������� ũ�⸦ �����Ͻðڽ��ϱ�(Default:5)? (y/n) : ");
					ans = inbr.readLine().trim().charAt(0);
					if (ans == 'y' || ans == 'Y') {
						System.out.println("ũ�⸦ �Է��ϼ��� : ");
						size = Integer.parseInt(inbr.readLine());

					} else if (!(ans == 'n' || ans == 'N')) {
						System.out.println("�߸��Է��߽��ϴ�.");
						continue;
					}
					break;

				}
				if (size != 5) {
					mb = new Mabang(size);
				} else
					mb = new Mabang();

				mb.resolveMabang();
				
			} else if (menuNum == 3) {
				System.out.print("�������� ���� ������ �Է��ϼ���(1~?) : ");
				int round;
				try {
					round = Integer.parseInt(inbr.readLine().trim());
				}catch(Exception e) {
					round = 0;
				}
				pn = new PerfectNum(round);
				System.out.print("1���� ���� " +round + "������ ������ :");
				System.out.println("\n�̰� �������� ������ " + pn.perfect() +"���Դϴ�."); //���ϰ��� �ֱ⶧��
				
				
			} else if (menuNum == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�ٽ� �����ϼ���.");
			}
			System.out.println();
		}

	}
}
