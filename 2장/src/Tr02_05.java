import java.io.*;
public class Tr02_05 {
	public static void main(String[] args) throws Exception {
		int intnum;
		double a;
		a=3.14159;
		BufferedReader inbr=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수를 입력하세요! :");
		
		intnum = Integer.parseInt(inbr.readLine());
		System.out.println("반지름은 : "+intnum+"입니다.");
		System.out.println("원주는 : "+(2*a*intnum)+"입니다.");
		
		
	}
}
