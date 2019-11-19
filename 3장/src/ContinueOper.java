
public class ContinueOper {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		System.out.println("continue문 사용 ");

		do {
			count++;
			if (count % 2 != 0)
				continue;
			sum += count;
		} while (count < 500);

		System.out.println("1부터 500까지 짝수의 합 : " + sum);
	}
}
