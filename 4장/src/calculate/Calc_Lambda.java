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

		menu.add("1.더하기");
		menu.add("2.빼기");
		menu.add("3.곱하기");
		menu.add("4.나누기");
		menu.add("5.종료");

		while (true) {
			for (int i = 0; i < menu.size(); i++) {
				System.out.print(menu.get(i) + "  ");
			}
			System.out.println();
			System.out.println("메뉴 번호를 입력하세요 : ");
			num = sc.next();	
//			nextLine() 사용하면 nextInt()에서 값넣고 엔터치면 nextLine()로 넘어옴->else로 넘어감 (BufferedReader권장)

			if (num.equals("1")) {
				System.out.println("더하기할 두 숫자를 입력하세요 : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("결과 : " + plus.method(x, y));

			} else if (num.equals("2")) {
				System.out.println("빼기할 두 숫자를 입력하세요 : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("결과 : " + minus.method(x, y));

			} else if (num.equals("3")) {
				System.out.println("곱셈할 두 숫자를 입력하세요 : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("결과 : " + mult.method(x, y));

			} else if (num.equals("4")) {
				System.out.println("나누기할 두 숫자를 입력하세요 : ");
				x = sc.nextInt();
				y = sc.nextInt();
				System.out.println("결과 : " + div.method(x, y));

			} else {
				System.out.println("종료합니다.");
				break;
			}

		}
	}
}