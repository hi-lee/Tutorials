import java.util.Scanner;

public class Ex03_05Practice {
	public static void main(String[] args) {
		int a, num;
		Scanner sc = new Scanner(System.in);

		System.out.println("상품의 단가와 수량을 입력하세요!");
		System.out.print("단가(원) : ");
		a = sc.nextInt();
		System.out.print("수량 : ");
		num = sc.nextInt();
		System.out.println("<< 출력 내용 >>");
		System.out.println("상품단가(원) : " + a);
		System.out.println("상품수량 : " + num);
		System.out.println("총금액(원) : " + (a * num));

		if (a * num >= 1000000) {
			System.out.println("할인율(%) : 40");
			System.out.println("지불금액(원) : " + (int)(a * num * 0.4));
		} else if (a * num >= 500000) {
			System.out.println("할인율(%) : 30");
			System.out.println("지불금액(원) : " + (int)(a * num * 0.3));
		} else {
			System.out.println("할인율(%) : 0");
			System.out.println("지불금액(원) : " + (a * num));
		}
	}
}
