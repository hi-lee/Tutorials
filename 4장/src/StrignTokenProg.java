import java.util.*;
import java.util.StringTokenizer;
public class StrignTokenProg {
	public static void main(String[] arags) {
		StringTokenizer str = new StringTokenizer("2008/02/15", "/");
		int count;
				
		count = str.countTokens();
		System.out.println("파싱할 문자열의 수는 총 " + count + " 개");
		
//		 while(str.hasMoreTokens()) {
//			 System.out.println(str.nextToken());
//		 }
		 
		 String [] str1 = new String [count]; //배열생성
		 for(int i = 0; i<count; i++) { //배열의 index point를 사용하므로 i=0 0부터 시작이좋음
			 str1[i] = str.nextToken();
			 System.out.println(str1[i]);

		 }
	}
}

		