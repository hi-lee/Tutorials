
public class BreakOper {
	public static void main(String[] args) {
		int x = 0;
		int sum = 0;
		System.out.println("<<���� �ݺ�>>");

		bklabel: while (true) {
			while (true) {
				if (x >= 500)
					break bklabel;
				x++;
				sum = sum + x;
			}
		}
		System.out.println("1���� 500 ������ �� : " + sum);
	}
}
