import java.util.*;

public class VectorTestEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<EmpInfo> vector = new Vector<>();	//vector ��ü ����
		String a, b, c;

		while (true) {
			System.out.println("�̸�, ��ȭ��ȣ, �ּҸ� �Է��ϼ���(0�Է½� ����)");
			a = sc.nextLine();
			b = sc.nextLine();
			c = sc.nextLine();

			if (a.equals("0") || b.equals("0") || c.equals("0")) {
				break;
			} else {
				vector.add(new EmpInfo(a, b, c));	//���� ������ ���� ���� ���Ѿ���->�ݺ��� �ȿ� �־�� ��		
			}			
		}
/*		EmpInfo infoTemp = new EmpInfo();
 * 		infoTemp.name = sc.next();
 * 		infoTemp.tel = sc.next();
 * 		infoTemp.address = sc.next();
 * 		if(info.Temp.name.equals("0") || info.Temp.tel.equals("0") || info.Temp.address.equals("0"))
 * 			break;
 * 		vector.add(infoTemp);		
 */
		System.out.println("������ ũ�� : " + vector.size());
		System.out.println("������ ����뷮 : " + vector.capacity());
		System.out.println();
		
		
		for(int i=0; i<vector.size(); i++) {
			EmpInfo info = vector.get(i);
			System.out.println(vector.get(i));
			System.out.println(info.name + "\t" + info.tel + "\t" + info.address);
		}
	}

}
