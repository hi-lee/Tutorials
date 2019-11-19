import java.util.*;

public class GenericWildcard {
	public static void main(String[] args) {
		Vector<String> carlist = new Vector<>(); // Vector: 행 처리 가능(컬렉션)
		carlist.add("쏘나타");
		carlist.add("아반떼");
		carlist.add("그랜저");
		carlist.add("제니시스");
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
