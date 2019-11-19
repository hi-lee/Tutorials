import java.io.*;
public class DowhileOper {
	public static void main(String[] args) throws IOException {
		int x=1; int y=1; int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("그릴 삼각형 높이를 입력하세요! : ");
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
