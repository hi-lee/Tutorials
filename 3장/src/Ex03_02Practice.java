import java.util.Scanner;

public class Ex03_02Practice {
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.print("정수값 2개를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("큰 값은 " + num1 + "입니다.");
			System.out.println("작은 값은 " + num2 + "입니다.");
		} else if(num1 < num2) { 	 //else if는 조건식 와야함(if때문에)
			System.out.println("큰 값은 " + num2 + "입니다.");
			System.out.println("작은 값은 " + num1 + "입니다.");
		}else {		//else if 다음에 else와야함
			System.out.println("두 값은 같다.");
		}

		}
}
