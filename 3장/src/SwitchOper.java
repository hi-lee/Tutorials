import java.util.*;

public class SwitchOper {
	public static void main(String[] args) throws Exception {
		int jumsu;
		String dept;
		Scanner scanner = new Scanner(System.in);
		System.out.println("과를 입력하세요 ! : ");
		dept = scanner.nextLine();
		System.out.println("당신의 점수를 입력하세요! : ");
		jumsu = scanner.nextInt();

		switch (dept) {
		case "컴퓨터공학부":
			System.out.println("학부 : " + dept);
			break;
		case "정보통신공학부":
			System.out.println("학부 : " + dept);
			break;
		default:
			System.out.println("학부 : " + "멀티미디어공학부");
		}
		switch (jumsu / 10) {
		case 10:
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;
		default:
			System.out.println("당신의 학점은 F입니다.");

		}
	}
}
