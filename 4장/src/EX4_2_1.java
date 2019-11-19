import java.io.*;

public class EX4_2_1 {
	public static void main(String[] args) throws IOException {
		System.out.print("출력할 문자열을 입력하세요 : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		String instr = inbr.readLine();
		EX4_2_1 ex = new EX4_2_1();

		System.out.println("입력한 물자열 : " + instr);
		System.out.print("거꾸로 바뀐 문자열 : " + ex.reverse(instr)); //return값 필요

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
