import java.util.*;

public class EX07_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, tel;
		Map<String, String> ht = new Hashtable<>(); //key(name), value(tel)값 가짐

		System.out.println("공백으로 분리된 이름과 전화번호 4개를 입력하십시오.");

		for (int i = 0; i < 4; i++) {
			System.out.print("이름, 전화번호 : ");
			name = sc.next();
			tel = sc.next(); //nextLine()넣어도 무방-엔터칠때까지 들어감
			ht.put(name, tel);	//map에 넣음-put
		}

		System.out.println("전화번호를 검색할 이름을 입력하십시오.");
		name = sc.next();	//nextLine()넣어도 무방
		System.out.println(name + "의 전화번호는 " + ht.get(name) + "입니다.");
//		key: name, value: tel	ht.get(name) -> value값 나옴
	}
}
//next() : 공백을 기준으로 입력을 받는다. 즉, 띄어쓰기(=\\s)을 기준으로 입력을 받는다.
//nextLine() : 한 라인을 기준으로 입력을 받는다. 즉, 개행문자(=줄넘김)(=\n)을 기준으로 입력을 받는다.
