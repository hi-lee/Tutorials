import java.util.Scanner;

public class ScanInput {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numInt;
		float numFloat, sum;
		String inString;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		inString = scanner.nextLine();
		System.out.print("�������� �Ǽ������� 2���� �Է��ϼ��� : ");
		numInt = scanner.nextInt();
		numFloat = scanner.nextFloat();
		sum = numInt + numFloat;
		
		System.out.println("�̸� : " + inString);
		System.out.println(numInt+"+"+numFloat+"="+sum);
     	System.out.printf("%d + %6.2f = %6.2f\n", numInt, numFloat, sum);
		
		
		
	}
}
