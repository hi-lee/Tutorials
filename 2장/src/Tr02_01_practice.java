import java.io.*;
public class Tr02_01_practice {
	public static void main(String[] args) throws Exception {
		String name, stdnum;
		int tople;
		
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�̸�, �й�, ���������� �Է��ϼ���! : ");
		name = inbr.readLine();
		stdnum = inbr.readLine();
		tople = Integer.parseInt(inbr.readLine());
		
		System.out.println("���� �̸��� "+name+"�Դϴ�.");
		System.out.println("�й��� "+stdnum+"�Դϴ�.");
		System.out.println("�׸��� ���������� "+tople+"�Դϴ�.");
		
	}
}
