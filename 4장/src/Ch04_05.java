import java.io.*;
public class Ch04_05 {
	public static void main(String[] args) throws IOException {
		System.out.print("����� ���ڿ��� �Է��ϼ���! : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		String instr = inbr.readLine();
		StringBuffer str = new StringBuffer(instr);
		
		System.out.println("�Է��� ���ڿ� : " + str);
		System.out.println("�Ųٷ� �ٲ� ���ڿ� : " + str.reverse());
	}
}
