import java.util.*;

public class SwitchOper {
	public static void main(String[] args) throws Exception {
		int jumsu;
		String dept;
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� ! : ");
		dept = scanner.nextLine();
		System.out.println("����� ������ �Է��ϼ���! : ");
		jumsu = scanner.nextInt();

		switch (dept) {
		case "��ǻ�Ͱ��к�":
			System.out.println("�к� : " + dept);
			break;
		case "������Ű��к�":
			System.out.println("�к� : " + dept);
			break;
		default:
			System.out.println("�к� : " + "��Ƽ�̵����к�");
		}
		switch (jumsu / 10) {
		case 10:
		case 9:
			System.out.println("����� ������ A�Դϴ�.");
			break;
		case 8:
			System.out.println("����� ������ B�Դϴ�.");
			break;
		case 7:
			System.out.println("����� ������ C�Դϴ�.");
			break;
		case 6:
			System.out.println("����� ������ D�Դϴ�.");
			break;
		default:
			System.out.println("����� ������ F�Դϴ�.");

		}
	}
}
