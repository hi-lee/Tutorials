import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
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
					System.out.print(i+"  ");				
			}
		}
		System.out.println();
		System.out.println("완전수의 갯수 : " + cnt);
	}
}
