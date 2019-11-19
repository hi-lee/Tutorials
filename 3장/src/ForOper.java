import java.io.*;

public class ForOper {
	public static void main(String[] args) throws IOException {
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("그릴 삼각형 높이를 입력하세요! : ");
		number = Integer.parseInt(inbr.readLine());
		
		for(int x=1; x<=number; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("x");
			}
		System.out.println();	
		}
		
		for(int x=1; x<=number; x++) {
			for(int y=(number-x); y>=0; y++) {
		/* for(int x=number; x>0; x--)
			for(int y=1; y<=x; y++) */
				System.out.print("x");
			}
		System.out.println();
		}
	}
}
