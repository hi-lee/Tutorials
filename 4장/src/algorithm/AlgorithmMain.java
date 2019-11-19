package algorithm;

import java.util.Scanner;

public class AlgorithmMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			System.out.println("***메뉴***");
			System.out.println("1. 수열(분수)");
			System.out.println("2. 수열(피보나치)");
			System.out.println("3. 이진검색");
			System.out.println("4. 완전수");
			System.out.println("5. 미방진");
			System.out.println("6. 종료");
			System.out.println("메뉴를 선택하시오 : ");
			num = sc.nextInt();

			Algorithm method = new Algorithm();
			// 메소드 부르기 위해 객체(인스턴스)를 생성해야함, 클래스 이름을 불러와 인스턴스로 전환
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
				System.out.println("종료");
				break;
			} else
				System.out.println("다시 선택하시오!!");
		}
	}

}
