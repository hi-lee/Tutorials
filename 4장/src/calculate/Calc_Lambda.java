package calculate;

import java.util.*;

public class Calc_Lambda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> menu = new ArrayList<>();
		CalcMethod plus;
		CalcMethod minus;
		CalcMethod mult;
		CalcMethod div;
		String num;
		int x, y;

		plus = (a, b) -> {
			float result = a + b;
			return result;
		};

		minus = (a, b) -> {
			float result = a - b;
			return result;
		};

		mult = (a, b) -> {
			float result = a * b;
			return result;
		};

		div = (a, b) -> {
			float result = a / b;
			return result;
		};

		menu.add("1.���ϱ�");
		menu.add("2.����");
		menu.add("3.���ϱ�");
		menu.add("4.������");
		menu.add("5.����");

		while (true) {
			for (int i = 0; i < menu.size(); i++) {
				System.out.print(menu.get(i) + "  ");
			}
			System.out.println();
			System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
			num = sc.next();	
//			nextLine() ����ϸ� nextInt()���� ���ְ� ����ġ�� nextLine()�� �Ѿ��->else�� �Ѿ (BufferedReader����)

			if (num.equals("1")) {
				System.out.println("���ϱ��� �� ���ڸ� �Է��ϼ��� : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("��� : " + plus.method(x, y));

			} else if (num.equals("2")) {
				System.out.println("������ �� ���ڸ� �Է��ϼ��� : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("��� : " + minus.method(x, y));

			} else if (num.equals("3")) {
				System.out.println("������ �� ���ڸ� �Է��ϼ��� : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("��� : " + mult.method(x, y));

			} else if (num.equals("4")) {
				System.out.println("�������� �� ���ڸ� �Է��ϼ��� : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("��� : " + div.method(x, y));

			} else {
				System.out.println("�����մϴ�.");
				break;
			}

		}
	}
}