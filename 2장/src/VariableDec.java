
public class VariableDec {
	public static void main(String[] args) {
		int g = 100;
		for (int i = 100; i < 300; i++) {
			int j = i * 5;
			while (j < 600) {
				int k = 300;
				System.out.print(g + " ");
				System.out.print(j + " ");
				System.out.println(k);
				j = j + 100;
			}
			System.out.print(g + " ");
			System.out.println(j);
		}
		System.out.println(g);
	}
}
