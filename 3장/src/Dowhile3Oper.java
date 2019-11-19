import java.io.*;

public class Dowhile3Oper {
	public static void main(String[] args) throws IOException {
		int innum;
		int outnum;
		int count;
		int sum = 0;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("합을 구하는 시작숫자 입력 : ");
		innum = Integer.parseInt(inbr.readLine());

		System.out.print("합을 구하는 끝 숫자 입력 : ");
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
		System.out.println(innum + "부터" + outnum + "까지의 합 : " + sum);
	}
}
