import java.util.Scanner;

public class Ex03_03Practice {
	public static void main(String[] arsg) {
		int a, b, mtp;
		
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("정수값 2개를 입력하세요 : ");
			a = sc.nextInt(); 
			b = sc.nextInt();  // 값입력도 반복되어야 함, 아닐시 무한반복

			System.out.println("두정수의 곱 : " + (a * b));

		} while ((a * b) <= 500);  //a*b 값이 500보다 작을 동안 반복, false여야 빠져나옴
		System.out.println("프로그램을 종료합니다.");
	}
}

//		while(true) {
//		}if(mtp>500) break;	
		
//		mtp=(int)(a*b);
//		while(mtp<=500); {  
//			System.out.print("정수값 2개를 입력하세요 : ");
//			a = sc.nextInt(); 
//			b = sc.nextInt();
//			System.out.println("두정수의 곱 : " + (a * b));
//					
//			
//		}
//		System.out.println("프로그램을 종료합니다.");
//	}	
//}
