import java.util.*;

public class GenericWildcard {
	public static void main(String[] args) {
		Vector<String> carlist = new Vector<>(); // Vector: �� ó�� ����(�÷���)
		carlist.add("�Ÿ");
		carlist.add("�ƹݶ�");
		carlist.add("�׷���");
		carlist.add("���Ͻý�");
		Vector<? extends Object> objectlist;
		objectlist = carlist;
		for (Object obj : objectlist) {
			System.out.print(obj + "    ");
		}
		System.out.println();
		for (Object obj : objectlist) {
			String car = (String) obj;
			System.out.print(car.toUpperCase() + "    ");
		}
	}
}
