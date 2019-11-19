package algorithm;

import java.util.Scanner;

class Algorithm {

	void CallFibonacciSum() {  //메소드 이름:CallFibonacciSum

		Scanner sc = new Scanner(System.in);
		int num;
		double j = 0, sum = 0;

		System.out.print("수열의 합을 구할 범위를 입력하세요 : ");
		num = sc.nextInt();
		System.out.print("수열 : ");
		for (int i = 1; i <= num; i++) {
			System.out.print("1/" + i + "  ");
			j = (1.0 / i);
			sum += j;
		}
		System.out.println("");
		System.out.println("합 : " + sum);
	}

	void callFibonacci() {

		Scanner sc = new Scanner(System.in);
		int a = 1, b = 0, num;
		int t = a + b; // t=a+b ->t변수 선언은 a,b있는 줄과 분리해서 하는게 좋음

		System.out.print("피보나치 수열을 구할 범위를 입력하세요 : ");
		num = sc.nextInt();
		System.out.println("결과 : ");

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

		System.out.print("완전수를 구할 범위를 입력하세요 : ");
		su = sc.nextInt();

		System.out.print(su + "까지의 완전수 :");
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
		System.out.println("완전수의 갯수 : " + cnt);
	}

	void CallBinarySearch() {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 7, 35, 40, 55, 63, 74, 86, 88, 91 };
		int l = 0, h = a.length - 1, m, k, cnt = 0;

		System.out.print("찾고싶은 값을 입력하세요 : ");
		k = sc.nextInt();

		while (true) {
			cnt++;
			m = (l + h) / 2; // a[m]의 m->배열의 위치를 나타냄, l=0 배열의 첫번째, h=a.length-1 배열이 마지막
			System.out.println(a[m]);
			if (a[m] == k) {
				System.out.println("찾는 자료는 " + (m + 1) + "번째 위치에 있습니다."); // 배열은 0부터 시작하기때문에 보여주기 위해 +1해줌
				break;
			} else {
				if (a[m] < k)
					l = m + 1;
				else
					h = m - 1;
				if (l > h) {
					System.out.println("자료가 존재하지 않습니다.");
					break;
				}

			}
		}
		System.out.println(cnt + "번 반복");
	}

	void CallMagicSquare() {
		Scanner sc = new Scanner(System.in);

		int size, i, j;

		System.out.print("마방진을 구할 배열의 크기를 입력하세요 : ");
		size = sc.nextInt();
		int a[][] = new int[size][size];

		i = 0; // 배열의 행 위치
		j = (size / 2); // 배열의 열 위치
		for (int n = 1; n <= (size * size); n++) {
			a[i][j] = n;
			if (n % size == 0) {
				i++;
			} else {
				i--;
				j++;
				if (i < 0)
					i = size - 1; // else문 안에 if문 2개가 들어감
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
