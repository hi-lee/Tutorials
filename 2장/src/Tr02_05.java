import java.io.*;
public class Tr02_05 {
	public static void main(String[] args) throws Exception {
		int intnum;
		double a;
		a=3.14159;
		BufferedReader inbr=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ �Է��ϼ���! :");
		
		intnum = Integer.parseInt(inbr.readLine());
		System.out.println("�������� : "+intnum+"�Դϴ�.");
		System.out.println("���ִ� : "+(2*a*intnum)+"�Դϴ�.");
		
		
	}
}
