import java.util.Scanner;
public class Tr02_02_practice { 
	public static void main(String[] args) throws Exception {

			Scanner sc=new Scanner(System.in);
			//BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("정수값 2개를 입력하세요 :! ");
			int a, b;
			
			a = sc.nextInt();
			b = sc.nextInt();
			//a = Integer.parseInt(inbr.readLine());
			//b = Integer.parseInt(inbr.readLine());
			
			System.out.println("a+b = "+(a+b));
			System.out.println("a-b = "+(a-b));
			System.out.println("a*b = "+(a*b));
			System.out.println("a/b = "+(a/(double)b));
			System.out.println("a%b = "+(a%b));
	}
}