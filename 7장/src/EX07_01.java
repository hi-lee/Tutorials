import java.util.*;

public class EX07_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, tel;
		Map<String, String> ht = new Hashtable<>(); //key(name), value(tel)�� ����

		System.out.println("�������� �и��� �̸��� ��ȭ��ȣ 4���� �Է��Ͻʽÿ�.");

		for (int i = 0; i < 4; i++) {
			System.out.print("�̸�, ��ȭ��ȣ : ");
			name = sc.next();
			tel = sc.next(); //nextLine()�־ ����-����ĥ������ ��
			ht.put(name, tel);	//map�� ����-put
		}

		System.out.println("��ȭ��ȣ�� �˻��� �̸��� �Է��Ͻʽÿ�.");
		name = sc.next();	//nextLine()�־ ����
		System.out.println(name + "�� ��ȭ��ȣ�� " + ht.get(name) + "�Դϴ�.");
//		key: name, value: tel	ht.get(name) -> value�� ����
	}
}
//next() : ������ �������� �Է��� �޴´�. ��, ����(=\\s)�� �������� �Է��� �޴´�.
//nextLine() : �� ������ �������� �Է��� �޴´�. ��, ���๮��(=�ٳѱ�)(=\n)�� �������� �Է��� �޴´�.
