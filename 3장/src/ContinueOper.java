
public class ContinueOper {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		System.out.println("continue�� ��� ");

		do {
			count++;
			if (count % 2 != 0)
				continue;
			sum += count;
		} while (count < 500);

		System.out.println("1���� 500���� ¦���� �� : " + sum);
	}
}
