import java.io.*;
public class Tr02_01_practice {
	public static void main(String[] args) throws Exception {
		String name, stdnum;
		int tople;
		
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름, 학번, 토플점수를 입력하세요! : ");
		name = inbr.readLine();
		stdnum = inbr.readLine();
		tople = Integer.parseInt(inbr.readLine());
		
		System.out.println("나의 이름은 "+name+"입니다.");
		System.out.println("학번은 "+stdnum+"입니다.");
		System.out.println("그리고 토플점수는 "+tople+"입니다.");
		
	}
}
