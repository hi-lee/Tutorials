package calculate;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		while (true) {

			System.out.println("1.계산기  \t 2.종료");
			Scanner sc = new Scanner(System.in);
			int go = sc.nextInt();

			if (go == 1) {
				System.out.println("두 정수와 연산자를 공백으로 분리하여 입력하세요(예: 수1 수2 연산자");
				Scanner sc2 = new Scanner(System.in);
				
				int input1 = sc2.nextInt();
				int input2 = sc2.nextInt();
				String input = sc2.next();
				char input3 = input.charAt(0);
				
				if (input3 == '+') {
					Add a = new Add();
				
					a.setValue(input1, input2);
					System.out.println(input1 + " + " + input2 + " = " + a.calc());
				}
			}
		}
	}

}
