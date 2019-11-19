import java.util.*;
import java.io.*;

public class MemberJoin {
	public static void main(String[] args) {
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		Vector<Member> list = new Vector<>();
		int menu = 0;

		while (true) {
			System.out.println("---�޴�---");
			System.out.println("1. ȸ������        2. ��������        3. ����");
			System.out.print("�����Ͻÿ� : ");

			try {
				menu = Integer.parseInt(inbr.readLine());
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.\n");
				continue; // ->�Ʒ� �������� �ʰ� while�� �� ó������ ���ư�
			} catch (Exception e) {
				System.out.println("�� �� ���� �����Դϴ�.");
				continue;
			}

			if (menu == 1) {
				System.out.println("ȸ������ �Է�");
				System.out.print("���̵� : ");
				String id = sc.next(); // nextLine()�� ���⵵ �����ϱ⶧���� next()���
				System.out.print("��й�ȣ : ");
				String password = sc.nextLine();
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				String tel = sc.nextLine();

				boolean exist = false;
				for (int i = 0; i < list.size(); i++) {
					if (id.equals((list.get(i)).id())) { // getter�޼ҵ带 �����ؾ� getId�� ��밡��
						System.out.println("��ϵ� ���̵��Դϴ�. �ٽ� �Է��ϼ���.");
						exist = true;
						break;
					}
				}
				if (!exist) {
					list.add(new Member(id, password, name, tel));
					System.out.println("��ϵǾ����ϴ�.");
				}

			} else if (menu == 2) {
				Enumeration<Member> em = list.elements();
				Member info = em.nextElement();
				System.out.println("ȸ����������");
				System.out.println("�̸� : " + info.name + ", id : " + info.id + ", password : " + info.password
						+ ", phone : " + info.tel);
//				list.get(i).info(); -> �޼ҵ� ȣ���ؼ� �ٷ� ���
			} else {
				System.out.println("�����մϴ�.");
				break;
			}

		}

	}
}
