import java.io.*;

public class Dowhile3Oper {
	public static void main(String[] args) throws IOException {
		int innum;
		int outnum;
		int count;
		int sum = 0;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ���ϴ� ���ۼ��� �Է� : ");
		innum = Integer.parseInt(inbr.readLine());

		System.out.print("���� ���ϴ� �� ���� �Է� : ");
		outnum = Integer.parseInt(inbr.readLine());

		if (innum <= outnum)
			count = innum;
		else {
			count = outnum;
			outnum = innum;
			innum = count;
		}
		do {
			sum += count;
			count++;

		} while (count < outnum);
		System.out.println(innum + "����" + outnum + "������ �� : " + sum);
	}
}
