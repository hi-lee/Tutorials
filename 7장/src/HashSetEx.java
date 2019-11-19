import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("VB");
		set.add("JAVA");
		set.add("VB");
		set.add("C");
		System.out.println("set의 데이터 개수 : " + set.size());
		set.remove("C");
		System.out.println("set의 데이터 개수 : " + set.size());

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		for (String str : set) {
			System.out.println("\t" + str);
		}
		System.out.println();
		Object[] str = set.toArray();
		for (int i = 0; i < str.length; i++) {
			System.out.println("\t" + str[i]);
		}
	}
}
