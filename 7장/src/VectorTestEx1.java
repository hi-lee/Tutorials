import java.util.*;

public class VectorTestEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<EmpInfo> vector = new Vector<>();	//vector 객체 생성
		String a, b, c;

		while (true) {
			System.out.println("이름, 전화번호, 주소를 입력하세요(0입력시 종료)");
			a = sc.nextLine();
			b = sc.nextLine();
			c = sc.nextLine();

			if (a.equals("0") || b.equals("0") || c.equals("0")) {
				break;
			} else {
				vector.add(new EmpInfo(a, b, c));	//값을 넣을때 마다 생성 시켜야함->반복문 안에 있어야 함		
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
		System.out.println("벡터의 크기 : " + vector.size());
		System.out.println("벡터의 저장용량 : " + vector.capacity());
		System.out.println();
		
		
		for(int i=0; i<vector.size(); i++) {
			EmpInfo info = vector.get(i);
			System.out.println(vector.get(i));
			System.out.println(info.name + "\t" + info.tel + "\t" + info.address);
		}
	}

}
