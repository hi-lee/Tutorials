import java.io.*;

public class Dowhile2Oper {
	public static void main(String[] args) throws IOException {
		int innum;
		int outnum;
		int count;
		int sum = 0;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ���ϴ� ���ۼ��� �Է� : ");
		innum = Integer.parseInt(inbr.readLine());
		do {
			System.out.print("���� ���ϴ� �� ���� �Է� : ");
			outnum = Integer.parseInt(inbr.readLine());
		} while (outnum <= innum);
		count = innum;
		sum = count;

		do {
			count++;
			sum += count;
		} while (count < outnum);
		System.out.println(innum + "����" + outnum + "������ �� : " + sum);
	}

}
