import java.io.*;
public class DowhileOper {
	public static void main(String[] args) throws IOException {
		int x=1; int y=1; int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�׸� �ﰢ�� ���̸� �Է��ϼ���! : ");
		number = Integer.parseInt(inbr.readLine());
		
		do {
			do {
				System.out.print("x");
				y = y + 1;
			}while(y <= x);
			System.out.println();
			x = x + 1;
			y = 1;
		}while(x <= number);
		
	}
}
