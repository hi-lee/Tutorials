import java.util.*;
public class EnumTestEx {
	 public static void main(String[] args) {
		 Vector<EmpInfo2> list = new Vector<>();
		 list.add(new EmpInfo2("ȫ�浿", "010-3221-6789", "���� ����"));
		 list.add(new EmpInfo2("�̱���", "010-3253-1234", "���� ���α�"));
		 list.add(new EmpInfo2("�̸��", "010-5234-5222", "���� ��������"));
		 
		 System.out.println("Enumeration ��� ��� ���");
		 Enumeration<EmpInfo2> em = list.elements();
		 while(em.hasMoreElements()) {
			 EmpInfo2 info = em.nextElement();
			 System.out.println(info.name + "\t" + info.tel + "\t" + info.address);
		 }
		 System.out.println("for-each ���� ��� ��� ���");
		 for(EmpInfo2 info:list) {	//for-each���� 
			 //getter/setter ��� ��� ���
			 String name = info.getName();
			 String tel = info.getTel();
			 String address = info.getAdderess();
			 System.out.println(name + "\t" + tel + "\t" + address);
			 //�ٸ� ��� ���
			 System.out.println(info.name + "\t" + info.tel + "\t" + info.address);
		 }
	 }
}
