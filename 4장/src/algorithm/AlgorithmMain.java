package algorithm;

import java.util.Scanner;

public class AlgorithmMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			System.out.println("***�޴�***");
			System.out.println("1. ����(�м�)");
			System.out.println("2. ����(�Ǻ���ġ)");
			System.out.println("3. �����˻�");
			System.out.println("4. ������");
			System.out.println("5. �̹���");
			System.out.println("6. ����");
			System.out.println("�޴��� �����Ͻÿ� : ");
			num = sc.nextInt();

			Algorithm method = new Algorithm();
			// �޼ҵ� �θ��� ���� ��ü(�ν��Ͻ�)�� �����ؾ���, Ŭ���� �̸��� �ҷ��� �ν��Ͻ��� ��ȯ
			if (num == 1)
				method.callFibonacci();
			else if (num == 2)
				method.callFibonacci();
			else if (num == 3)
				method.CallBinarySearch();
			else if (num == 4)
				method.callPerfectNumber();
			else if (num == 5)
				method.CallMagicSquare();
			else if (num == 6) {
				System.out.println("����");
				break;
			} else
				System.out.println("�ٽ� �����Ͻÿ�!!");
		}
	}

}
