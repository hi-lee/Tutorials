import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 7, 35, 40, 55, 63, 74, 86, 88, 91 };
		int l = 0, h = a.length - 1, m, k, cnt=0;

		System.out.print("찾고싶은 값을 입력하세요 : ");
		k = sc.nextInt();

		while (true) {
			cnt++;
			m = (l + h) / 2; //a[m]의 m->배열의 위치를 나타냄, l=0 배열의 첫번째, h=a.length-1 배열이 마지막
			System.out.println(a[m]);
			if (a[m] == k) {
				System.out.println("찾는 자료는 " + (m + 1) + "번째 위치에 있습니다."); //배열은 0부터 시작하기때문에 보여주기 위해 +1해줌
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
			System.out.println(cnt+"번 반복");
	}
}
