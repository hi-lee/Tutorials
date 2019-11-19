import java.util.*;

public class HashtableEx {

	public static void main(String[] args) {
		Map<String, String> ht = new Hashtable<>();
		// Hashtable<String, String> ht = new Hashtable<>();

		ht.put("Grapes", "����"); // Grapes: key, ����: value
		ht.put("Apple", "���");
		ht.put("Strawberry", "����");
		ht.put("Orange", "������");

		System.out.println("hashtable�� Ű�� �� : " + ht.size());

		System.out.println("hashtable�� Ű�� ���� ã�� : " + ht.get("Apple")); // get(key)->value�� ����
		System.out.println();
		Set<String> keyset = ht.keySet(); // ��� key���� Set��ü�� �ѱ�, <String>: Ű���� �´� �ڷ���
		Iterator<String> keyiterator = keyset.iterator(); // keyset�� iterator�� ��ȯ
		while (keyiterator.hasNext()) {

			String k = keyiterator.next();
			String v = ht.get(k);
			System.out.println("Ű : " + k + " ---> �� : " + v);
		}
	}
}