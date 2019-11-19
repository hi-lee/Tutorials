import java.util.*;
public class IteratorTestEx {
	public static void main(String[] args) {
		ArrayList<EmpInfo> list = new ArrayList<>();
		
		list.add(new EmpInfo("홍길동", "010-3221-6789", "서울 은평구"));
		list.add(new EmpInfo("이근형", "010-3252-1234", "서울 구로구"));
		list.add(new EmpInfo("이명박", "010-5234-5222", "서울 영등포구"));
		
		Iterator<EmpInfo> it = list.iterator();	//ArrayList자료형인 <EmpInfo>와 자료형 맞춰야함
		while(it.hasNext()) {
			EmpInfo info = it.next(); //next()값을 저장시킨 다음에 출력해야함 (값이 넘어가기때문에)
			System.out.println(info.name + "\t" + info.tel + "\t" + info.address);
		}
	}
}
