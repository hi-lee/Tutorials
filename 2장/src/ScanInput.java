import java.util.Scanner;

public class ScanInput {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numInt;
		float numFloat, sum;
		String inString;
		
		System.out.print("이름을 입력하세요 : ");
		inString = scanner.nextLine();
		System.out.print("정수형과 실수형숫자 2개를 입력하세요 : ");
		numInt = scanner.nextInt();
		numFloat = scanner.nextFloat();
		sum = numInt + numFloat;
		
		System.out.println("이름 : " + inString);
		System.out.println(numInt+"+"+numFloat+"="+sum);
     	System.out.printf("%d + %6.2f = %6.2f\n", numInt, numFloat, sum);
		
		
		
	}
}
