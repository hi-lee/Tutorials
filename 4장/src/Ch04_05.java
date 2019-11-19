import java.io.*;
public class Ch04_05 {
	public static void main(String[] args) throws IOException {
		System.out.print("출력할 문자열을 입력하세요! : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		String instr = inbr.readLine();
		StringBuffer str = new StringBuffer(instr);
		
		System.out.println("입력한 문자열 : " + str);
		System.out.println("거꾸로 바뀐 문자열 : " + str.reverse());
	}
}
