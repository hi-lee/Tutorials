import java.util.*;

public class ArrayListNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		String i;

		while (true) {
			System.out.print("�Է��� ��(0�Է½� ����) : ");
			i = sc.nextLine();

			if (i.equals("0")) { //��ü.equals() -> ���ڿ���
				System.out.println("end");
				break;
			} else {
				list.add(i);
			}
		}
		
		System.out.println("ArrayList ��ü�� : " + list.size());
		
		for (int j = 0; j < list.size(); j++) {	
			System.out.print(list.get(j) + "   ");	//list.get(j) j�� �ε��� ��ȣ�� �ʿ�->for/while/for��� ���
		}

	}

}
