import java.util.*;

public class HashtableEx {

	public static void main(String[] args) {
		Map<String, String> ht = new Hashtable<>();
		// Hashtable<String, String> ht = new Hashtable<>();

		ht.put("Grapes", "포도"); // Grapes: key, 포도: value
		ht.put("Apple", "사과");
		ht.put("Strawberry", "딸기");
		ht.put("Orange", "오렌지");

		System.out.println("hashtable의 키의 수 : " + ht.size());

		System.out.println("hashtable의 키로 값을 찾음 : " + ht.get("Apple")); // get(key)->value값 리턴
		System.out.println();
		Set<String> keyset = ht.keySet(); // 모든 key값을 Set객체로 넘김, <String>: 키값에 맞는 자료형
		Iterator<String> keyiterator = keyset.iterator(); // keyset을 iterator로 변환
		while (keyiterator.hasNext()) {

			String k = keyiterator.next();
			String v = ht.get(k);
			System.out.println("키 : " + k + " ---> 값 : " + v);
		}
	}
}