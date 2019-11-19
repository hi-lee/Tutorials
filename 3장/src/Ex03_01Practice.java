import java.io.*;

public class Ex03_01Practice {
	public static void main(String[] args) throws IOException {
		int a;
		int sum = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc = new Scanner(System.in);

		System.out.println("한 개의 정수를 입력하세요 ! : ");
		a = Integer.parseInt(inbr.readLine());
		//num = sc.nextInt();

		for (int i = 1; i < a; i++) {
			if (i % 5 == 0) {
				sum = sum + i;
				/*cnt++;
				 * sum+=i;
				 */

			}
		}
		System.out.println("1부터 입력된 정수 " + a + "까지의 5의 배수의 갯수 : " + (a / 5));
		System.out.println("1부터 입력된 정수 " + a + "까지의 5의 배수의 합계 : " + sum);
	}
}

