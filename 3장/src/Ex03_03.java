import java.io.*;

public class Ex03_03 {
	public static void main(String[] arsg) throws IOException {
		int[] x = new int[5];
		int max = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("5���� ������ �Է��ϼ��� : ");

		for (int i = 0; i < x.length; i++) {
			x[i] = Integer.parseInt(inbr.readLine());
			if (x[i] > max)
				max = x[i];
		}
		System.out.println("**5���� ������ �ִ밪 ���ϱ�**");
		System.out.println("�Է°� : ");
		for (int i : x) {
			System.out.print("\t " + i);
		}
		System.out.println();
		System.out.println("�ִ밪 : " + max);
	}
}
