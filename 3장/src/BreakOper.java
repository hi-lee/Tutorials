
public class BreakOper {
	public static void main(String[] args) {
		int x = 0;
		int sum = 0;
		System.out.println("<<무한 반복>>");

		bklabel: while (true) {
			while (true) {
				if (x >= 500)
					break bklabel;
				x++;
				sum = sum + x;
			}
		}
		System.out.println("1부터 500 까지의 합 : " + sum);
	}
}
