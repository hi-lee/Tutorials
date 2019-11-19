
import java.util.Scanner;
public class ScannerIntInput2 {
	public static void main(String[] args) throws Exception {
		int intnum;
		double dblnum;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수와 실수를 입력하세요! : ");
		intnum = scanner.nextInt();
		dblnum = scanner.nextInt();
		System.out.println("입력한 정수는 " + intnum + " 입니다.");
		System.out.println("입력한 실수는 " + dblnum + "입니다.");
		
	}
}
