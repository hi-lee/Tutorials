
import java.util.Scanner;
public class ScannerIntInput2 {
	public static void main(String[] args) throws Exception {
		int intnum;
		double dblnum;
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Ǽ��� �Է��ϼ���! : ");
		intnum = scanner.nextInt();
		dblnum = scanner.nextInt();
		System.out.println("�Է��� ������ " + intnum + " �Դϴ�.");
		System.out.println("�Է��� �Ǽ��� " + dblnum + "�Դϴ�.");
		
	}
}
