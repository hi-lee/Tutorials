import java.util.*;
public class EnumTestEx {
	 public static void main(String[] args) {
		 Vector<EmpInfo2> list = new Vector<>();
		 list.add(new EmpInfo2("홍길동", "010-3221-6789", "서울 은평구"));
		 list.add(new EmpInfo2("이근형", "010-3253-1234", "서울 구로구"));
		 list.add(new EmpInfo2("이명박", "010-5234-5222", "서울 영등포구"));
		 
		 System.out.println("Enumeration 사용 출력 방법");
		 Enumeration<EmpInfo2> em = list.elements();
		 while(em.hasMoreElements()) {
			 EmpInfo2 info = em.nextElement();
			 System.out.println(info.name + "\t" + info.tel + "\t" + info.address);
		 }
		 System.out.println("for-each 루프 사용 출력 방법");
		 for(EmpInfo2 info:list) {	//for-each루프 
			 //getter/setter 사용 출력 방법
			 String name = info.getName();
			 String tel = info.getTel();
			 String address = info.getAdderess();
			 System.out.println(name + "\t" + tel + "\t" + address);
			 //다른 출력 방법
			 System.out.println(info.name + "\t" + info.tel + "\t" + info.address);
		 }
	 }
}
