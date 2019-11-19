import java.util.Scanner;

public class Ex03_04Practice {
	public static void main(String[] args) {
		int attend;
		int assign;
		int mid;
		int fin;
		double sum;
		Scanner sc = new Scanner(System.in);

		System.out.println("출석, 과제, 중간고사, 기말고사 점수를 입력하세요!");

		System.out.print("출석 점수 : ");
		attend = sc.nextInt();
		System.out.print("과제 점수 : ");
		assign = sc.nextInt();
		System.out.print("중간고사 점수 : ");
		mid = sc.nextInt();
		System.out.print("기말고사 점수 : ");
		fin = sc.nextInt();
		
		sum = (int) ((attend * 0.2) + (assign * 0.2) + (mid * 0.3) + (fin * 0.3));
		System.out.println("총점 : " + sum);
		if (sum >= 90) {
			System.out.println("학점 : A");
		} else if (sum >= 80) {
			System.out.println("학점 : B");
		} else if (sum >= 70) {
			System.out.println("학점 : C");
		} else if (sum >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");

		}
		
/*		total=att*0.2+h2*
				tot=(int)(total/10);
		switch(tot) {
		case 10:
		case 9:
			credit='A'; break;
		case 8:
		credit='B'; break;
*/			
		}

	}


