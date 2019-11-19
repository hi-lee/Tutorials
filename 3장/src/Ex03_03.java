import java.io.*;

public class Ex03_03 {
	public static void main(String[] arsg) throws IOException {
		int[] x = new int[5];
		int max = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("5개의 정수를 입력하세요 : ");

		for (int i = 0; i < x.length; i++) {
			x[i] = Integer.parseInt(inbr.readLine());
			if (x[i] > max)
				max = x[i];
		}
		System.out.println("**5개의 정수중 최대값 구하기**");
		System.out.println("입력값 : ");
		for (int i : x) {
			System.out.print("\t " + i);
		}
		System.out.println();
		System.out.println("최대값 : " + max);
	}
}
