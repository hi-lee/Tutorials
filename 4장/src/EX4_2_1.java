import java.io.*;

public class EX4_2_1 {
	public static void main(String[] args) throws IOException {
		System.out.print("����� ���ڿ��� �Է��ϼ��� : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		String instr = inbr.readLine();
		EX4_2_1 ex = new EX4_2_1();

		System.out.println("�Է��� ���ڿ� : " + instr);
		System.out.print("�Ųٷ� �ٲ� ���ڿ� : " + ex.reverse(instr)); //return�� �ʿ�

	}

	public String reverse(String instr) {
//		String str = new String();
		String str = "";

		for (int i = instr.length(); i > 0; i--) { //instr.length()-1; i>0; i--
			str = str + instr.charAt(i);			
		}
		return str;
	}
}
