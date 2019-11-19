import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
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
			if(t>num) break;
			System.out.print(t + "\t");			
		}
	}
}
//int a=1; b=0; t;	
//while((t=a+b)<=num) {
//	System.out.print(t+" ");
//	a = b;
//	b = t;