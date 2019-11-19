import java.io.*;
public class StreamIntInput {
	public static void main(String[] args) throws Exception {
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("년도를 입력하세요! : ");
		number=Integer.parseInt(inbr.readLine());
		System.out.println("입력한 년도는 "+number+"년 입니다.");
	}
}
