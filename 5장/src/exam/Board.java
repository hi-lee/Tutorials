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

			System.out.println("----------�޴�----------");
			System.out.println("1. �۵�� \t\t| 2.�۸��\t 3. ����");
			System.out.println("�޴��� �����Ͻÿ� : ");
			menu = sc.next();

			if (menu.equals("1")) {
				System.out.print("�������� �Է��ϼ��� : ");
				String subj = sc.next();
				bv.setBoard_subj(subj);
				System.out.print("�ۼ��� : ");
				String writer = sc.next();
				bv.setBoard_writer(writer);
				System.out.print("��й�ȣ : ");
				String pw = sc.next();
				bv.setBoard_pw(pw);
				System.out.print("���� : ");
				String cont = sc.next();
				bv.setBoard_cont(cont);
				System.out.println("��ϵǾ����ϴ�.");

			} else if (menu.equals("2")) {
				System.out.print("[�۹�ȣ       |  ������            | �����]");
				System.out.println();

				if(list.size() != 0) {
					num = list.get(list.size()-1).getBoard_num()+1;
				}
				

				System.out.print(bv.getBoard_subj() + "         |");
				System.out.print(new Date());
				System.out.println();
			} else {
				System.out.println("�����մϴ�.");
				break;
			}
		}

	}
}
