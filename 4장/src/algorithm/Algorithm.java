package algorithm;

import java.util.Scanner;

class Algorithm {

	void CallFibonacciSum() {  //�޼ҵ� �̸�:CallFibonacciSum

		Scanner sc = new Scanner(System.in);
		int num;
		double j = 0, sum = 0;

		System.out.print("������ ���� ���� ������ �Է��ϼ��� : ");
		num = sc.nextInt();
		System.out.print("���� : ");
		for (int i = 1; i <= num; i++) {
			System.out.print("1/" + i + "  ");
			j = (1.0 / i);
			sum += j;
		}
		System.out.println("");
		System.out.println("�� : " + sum);
	}

	void callFibonacci() {

		Scanner sc = new Scanner(System.in);
		int a = 1, b = 0, num;
		int t = a + b; // t=a+b ->t���� ������ a,b�ִ� �ٰ� �и��ؼ� �ϴ°� ����

		System.out.print("�Ǻ���ġ ������ ���� ������ �Է��ϼ��� : ");
		num = sc.nextInt();
		System.out.println("��� : ");

		while (t < num) {
			t = a + b;
			a = b;
			b = t;
			if (t > num)
				break;
			System.out.print(t + "\t");
		}
	}

	void callPerfectNumber() {
		int su, k, sum, cnt = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ���� ������ �Է��ϼ��� : ");
		su = sc.nextInt();

		System.out.print(su + "������ ������ :");
		for (int i = 2; i <= su; i++) {
			k = i / 2;
			sum = 0;
			for (int j = 1; j <= k; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				cnt++;
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		System.out.println("�������� ���� : " + cnt);
	}

	void CallBinarySearch() {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 7, 35, 40, 55, 63, 74, 86, 88, 91 };
		int l = 0, h = a.length - 1, m, k, cnt = 0;

		System.out.print("ã����� ���� �Է��ϼ��� : ");
		k = sc.nextInt();

		while (true) {
			cnt++;
			m = (l + h) / 2; // a[m]�� m->�迭�� ��ġ�� ��Ÿ��, l=0 �迭�� ù��°, h=a.length-1 �迭�� ������
			System.out.println(a[m]);
			if (a[m] == k) {
				System.out.println("ã�� �ڷ�� " + (m + 1) + "��° ��ġ�� �ֽ��ϴ�."); // �迭�� 0���� �����ϱ⶧���� �����ֱ� ���� +1����
				break;
			} else {
				if (a[m] < k)
					l = m + 1;
				else
					h = m - 1;
				if (l > h) {
					System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
					break;
				}

			}
		}
		System.out.println(cnt + "�� �ݺ�");
	}

	void CallMagicSquare() {
		Scanner sc = new Scanner(System.in);

		int size, i, j;

		System.out.print("�������� ���� �迭�� ũ�⸦ �Է��ϼ��� : ");
		size = sc.nextInt();
		int a[][] = new int[size][size];

		i = 0; // �迭�� �� ��ġ
		j = (size / 2); // �迭�� �� ��ġ
		for (int n = 1; n <= (size * size); n++) {
			a[i][j] = n;
			if (n % size == 0) {
				i++;
			} else {
				i--;
				j++;
				if (i < 0)
					i = size - 1; // else�� �ȿ� if�� 2���� ��
				if (j > size - 1)
					j = 0;
			}
		}
		for (i = 0; i <= 4; i++) {
			for (j = 0; j <= 4; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
