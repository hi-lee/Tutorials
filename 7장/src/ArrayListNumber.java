import java.util.*;

public class ArrayListNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		String i;

		while (true) {
			System.out.print("입력할 값(0입력시 종료) : ");
			i = sc.nextLine();

			if (i.equals("0")) { //객체.equals() -> 문자열비교
				System.out.println("end");
				break;
			} else {
				list.add(i);
			}
		}
		
		System.out.println("ArrayList 객체수 : " + list.size());
		
		for (int j = 0; j < list.size(); j++) {	
			System.out.print(list.get(j) + "   ");	//list.get(j) j의 인덱스 번호가 필요->for/while/for향상문 사용
		}

	}

}
