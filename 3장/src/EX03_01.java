import java.io.*;

public class EX03_01 {
	public static void main(String[] args) throws IOException {
		int intvalue;
		int resvalue=0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		System.out.print("숫자를 입력하세요 : ");
		intvalue = Integer.parseInt(inbr.readLine());
		
		while(intvalue > 0)
		{
			resvalue = resvalue * 10;
			resvalue = resvalue + (intvalue % 10);
			intvalue = (intvalue / 10);
		}
		System.out.print("바뀐 숫자 : " + resvalue);
	}
}
