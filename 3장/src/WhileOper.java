import java.io.*;
public class WhileOper {
	public static void main(String[] args) throws IOException {
		int x=1;
		int y=1;
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("그릴 삼각형 높이를 입력하세요! : ");
		number = Integer.parseInt(inbr.readLine());
		
		while(x<=number) {
			while(y<=x) {
			System.out.print("x");
			y = y + 1;
		}
		System.out.println();
		x = x+1;
		y=1;
		}
		
		int a = 1;
		int b = 1;
		
		while(a<=number) {
			while(b<=(number-a)+1) {
				System.out.print("x");
				b = b + 1;
			}
		System.out.println();
		a = a + 1;
		b = 1;
		}
		/* x=number;
		 * y=1;
		 * while(x<0) {
		 * 	while(y<=x) {
		 * 		System.out.print("x");
		 * 		y++;
		 * 		y+=1;
		 * }
		 */
	}
}
