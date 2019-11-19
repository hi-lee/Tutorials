import java.util.*;
import java.io.*;

public class MemberJoin {
	public static void main(String[] args) {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		Vector<Member> list = new Vector<>();
		int menu = 0;

		while (true) {
			System.out.println("---메뉴---");
			System.out.println("1. 회원가입        2. 정보보기        3. 종료");
			System.out.print("선택하시오 : ");

			try {
				menu = Integer.parseInt(inbr.readLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.\n");
				continue; // ->아래 실행하지 않고 while문 맨 처음으로 돌아감
			} catch (Exception e) {
				System.out.println("알 수 없는 오류입니다.");
				continue;
			}

			if (menu == 1) {
				System.out.println("회원정보 입력");
				System.out.print("아이디 : ");
				String id = sc.next(); // nextLine()은 띄어쓰기도 포함하기때문에 next()사용
				System.out.print("비밀번호 : ");
				String password = sc.nextLine();
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("전화번호 : ");
				String tel = sc.nextLine();

				boolean exist = false;
				for (int i = 0; i < list.size(); i++) {
					if (id.equals((list.get(i)).id())) { // getter메소드를 생성해야 getId로 사용가능
						System.out.println("등록된 아이디입니다. 다시 입력하세요.");
						exist = true;
						break;
					}
				}
				if (!exist) {
					list.add(new Member(id, password, name, tel));
					System.out.println("등록되었습니다.");
				}

			} else if (menu == 2) {
				Enumeration<Member> em = list.elements();
				Member info = em.nextElement();
				System.out.println("회원정보보기");
				System.out.println("이름 : " + info.name + ", id : " + info.id + ", password : " + info.password
						+ ", phone : " + info.tel);
//				list.get(i).info(); -> 메소드 호출해서 바로 출력
			} else {
				System.out.println("종료합니다.");
				break;
			}

		}

	}
}
