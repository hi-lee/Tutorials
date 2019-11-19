package algorithm;

import java.io.*;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		int menuNum = 0;
		char ans = 0; // BufferedReader는 String으로 입력받음
		Mabang mb;
		BinarySearch bs;
		PerfectNum pn;
		int su, cnt = 0;
		while (true) {
			System.out.println("****메뉴****");
			System.out.println("1.이진검색");
			System.out.println("2. 마방진");
			System.out.println("3. 완전수");
			System.out.println("6. 종료");
			System.out.print("작업을 선택하세요 :");

			menuNum = Integer.parseInt(inbr.readLine());

			if (menuNum == 1) {
				System.out.print("찾고자 하는 값을 입력하세요(1~100) : ");
				int k = Integer.parseInt(inbr.readLine());
				bs = new BinarySearch(k);
				bs.bSearch();
			} else if (menuNum == 2) {
				int size = 5;
				while (true) {
					System.out.println("마방진의 크기를 조정하시겠습니까(Default:5)? (y/n) : ");
					ans = inbr.readLine().trim().charAt(0);
					if (ans == 'y' || ans == 'Y') {
						System.out.println("크기를 입력하세요 : ");
						size = Integer.parseInt(inbr.readLine());

					} else if (!(ans == 'n' || ans == 'N')) {
						System.out.println("잘못입력했습니다.");
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
				System.out.print("완전수를 구할 범위를 입력하세요(1~?) : ");
				int round;
				try {
					round = Integer.parseInt(inbr.readLine().trim());
				}catch(Exception e) {
					round = 0;
				}
				pn = new PerfectNum(round);
				System.out.print("1에서 부터 " +round + "까지의 완전수 :");
				System.out.println("\n이고 완전수의 갯수는 " + pn.perfect() +"개입니다."); //리턴값이 있기때문
				
				
			} else if (menuNum == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("다시 선택하세요.");
			}
			System.out.println();
		}

	}
}
