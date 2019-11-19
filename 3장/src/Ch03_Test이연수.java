import java.util.Scanner;

public class Ch03_Test이연수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char n[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' }; //숫자에 대응되는 문자
		char s[] = new char[13]; //10자리 숫자를 입력할 배열 (,포함)
		int num, mok, nam, i = 0;

		System.out.print("최대 10자리 이하 정수를 입력하세요! : ");
		num = sc.nextInt();
//		System.out.print("결과 : ");

		while (num != 0) { 
			if((i+1)%4==0) 
				s[i]=',';
			else {
				mok = num / 10;
				nam = num % 10;
				s[i] = n[nam];
				num=mok;
			}
			++i;
		}
		System.out.println("결과 : ");
		
		for(int j=i-1;j>=0;j--) {
			System.out.print(s[j]);
		}
	}
}
			

//			for (i = 0; i < 10; i++) { 
//				if ((i + 1) % 4 == 0) { //4의 배수가 되는 자리에 ','를 대입
//					s[i] = ',';
//				}else {
//				mok = num / 10;		
//				nam = num % 10;
//				s[i] = n[nam];		
//				num=mok;				
//				}
//				i--;				
//				if (i >= 0) {
//					System.out.println(s[i]);
//					i--;
//				}else {
//					System.out.println();break;
//				}
//			}

	


