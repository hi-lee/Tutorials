import java.io.*;

public class Ex03_01For {
	public static void main(String[] args) throws IOException {
		int intvalue;
		int resvalue = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		System.out.print("숫자를 입력하세요 : ");

		for (intvalue = Integer.parseInt(inbr.readLine()); intvalue > 0; intvalue = intvalue / 10) {
			resvalue = resvalue * 10;
			resvalue = resvalue + (intvalue % 10);

		}

		System.out.print("바뀐 숫자 : " + resvalue);
	}
}

/*for문의 초기값 : while문 위에
*for(; 조건식; ) : while(조건식)
for문의 증감식 : while문 아래에 */