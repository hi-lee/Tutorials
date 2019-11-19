import java.util.Scanner;

public class ScannerIntInput {


		public static void main(String[] args) throws Exception {
			int number;
			Scanner sc=new Scanner(System.in);
		    System.out.println("년도를 입력하세요! : ");
			number=sc.nextInt();
			System.out.println("입력한 년도는 "+number+"년 입니다.");
		}
	}

