import java.util.*;
public class IteratorTestEx {
	public static void main(String[] args) {
		ArrayList<EmpInfo> list = new ArrayList<>();
		
		list.add(new EmpInfo("ȫ�浿", "010-3221-6789", "���� ����"));
		list.add(new EmpInfo("�̱���", "010-3252-1234", "���� ���α�"));
		list.add(new EmpInfo("�̸��", "010-5234-5222", "���� ��������"));
		
		Iterator<EmpInfo> it = list.iterator();	//ArrayList�ڷ����� <EmpInfo>�� �ڷ��� �������
		while(it.hasNext()) {
			EmpInfo info = it.next(); //next()���� �����Ų ������ ����ؾ��� (���� �Ѿ�⶧����)
			System.out.println(info.name + "\t" + info.tel + "\t" + info.address);
		}
	}
}
