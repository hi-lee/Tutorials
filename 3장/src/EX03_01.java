import java.io.*;

public class EX03_01 {
	public static void main(String[] args) throws IOException {
		int intvalue;
		int resvalue=0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		intvalue = Integer.parseInt(inbr.readLine());
		
		while(intvalue > 0)
		{
			resvalue = resvalue * 10;
			resvalue = resvalue + (intvalue % 10);
			intvalue = (intvalue / 10);
		}
		System.out.print("�ٲ� ���� : " + resvalue);
	}
}
