
import java.io.*;
public class StreamInt2Input {
	public static void main(String[] args) throws Exception {
		int intnum;
		double dblnum;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ �Ǽ��� �Է��ϼ���! : ");
		intnum = Integer.parseInt(inbr.readLine());
		dblnum = Double.parseDouble(inbr.readLine());
		System.out.println("�Է��� ������ " + intnum + " �Դϴ�.");
		System.out.println("�Է��� �Ǽ��� " + dblnum + "�Դϴ�.");
		
	}
}
