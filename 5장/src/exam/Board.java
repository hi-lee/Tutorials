package exam;

import java.util.*;

public class Board {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String board_subj, board_writer, board_pw, board_cont;
		BoardValue bv = new BoardValue();
		List<String> list = new ArrayList<>();
		String menu;
		int num = 1; 

		while (true) {

			System.out.println("----------메뉴----------");
			System.out.println("1. 글등록 \t\t| 2.글목록\t 3. 종료");
			System.out.println("메뉴를 선택하시오 : ");
			menu = sc.next();

			if (menu.equals("1")) {
				System.out.print("글제목을 입력하세요 : ");
				String subj = sc.next();
				bv.setBoard_subj(subj);
				System.out.print("작성자 : ");
				String writer = sc.next();
				bv.setBoard_writer(writer);
				System.out.print("비밀번호 : ");
				String pw = sc.next();
				bv.setBoard_pw(pw);
				System.out.print("내용 : ");
				String cont = sc.next();
				bv.setBoard_cont(cont);
				System.out.println("등록되었습니다.");

			} else if (menu.equals("2")) {
				System.out.print("[글번호       |  글제목            | 등록일]");
				System.out.println();

				if(list.size() != 0) {
					num = list.get(list.size()-1).getBoard_num()+1;
				}
				

				System.out.print(bv.getBoard_subj() + "         |");
				System.out.print(new Date());
				System.out.println();
			} else {
				System.out.println("종료합니다.");
				break;
			}
		}

	}
}
