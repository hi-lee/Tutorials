import java.util.*;

public class ArrayListProg {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Pig");
		list.add("Dog");
		list.add("Cow");

		System.out.println("ArrayList °´Ã¼ ¼ö : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "    "); //list°´Ã¼.get(ÀÎµ¦½º¹øÈ£)
		}

		list.add("Snake");
		list.add(2, "Cat");

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "    ");
		}
		System.out.println();

		list.remove(3);	//ÀÎµ¦½º¹øÈ£
		Iterator e = list.iterator();
		while (e.hasNext()) {
			System.out.print(e.next() + "    ");
		}
		System.out.println();

		list.remove("Pig");	//°ª
		for (String obj : list) {
			System.out.print(obj + "    ");
		}
	}
}
